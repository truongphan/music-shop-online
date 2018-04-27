package btm.training.springboot.shoponline.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNTS")
public class Account implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String ROLE_MANAGER = "MANAGER";
	public static final String ROLE_EMPLOYEE = "EMPLOYEE";
	
	@Id
	@Column(name="USER_NAME", length=20, nullable = false)
	private String userName;
	@Column(name="ENCRYTED_PASSWORD", length=128, nullable = false)
	private String encryptedPassword;
	@Column(name="ACTIVE", length=1, nullable = false)
	private boolean active;
	@Column(name="USER_ROLE", length=20, nullable = false)
	private String userRole;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	@Override
    public String toString() {
        return "[" + this.userName + "," + this.encryptedPassword + "," + this.userRole + "]";
    }
}
