package btm.training.springboot.shoponline.validator;

import org.apache.commons.validator.routines.EmailValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import btm.training.springboot.shoponline.form.CustomerForm;

@Component
public class CustomerFormValidator implements Validator {

	private EmailValidator emailValidator = EmailValidator.getInstance();

	// this validator was used only to check to CustomerForm.
	@Override
	public boolean supports(Class<?> clazz) {
		return clazz == CustomerForm.class;
	}

	@Override
	public void validate(Object target, Errors errors) {

		CustomerForm custInfo = (CustomerForm) target;

		// Checking CustomerForm's fields.
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty.customerForm.name");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty.customerForm.email");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "NotEmpty.customerForm.address");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phone", "NotEmpty.customerForm.phone");

		if (!emailValidator.isValid(custInfo.getEmail())) {
			errors.rejectValue("email", "Pattern.customerForm.email");
		}
	}
}
