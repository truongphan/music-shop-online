package btm.training.springboot.shoponline.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="PRODUCTS")
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="CODE", length=20, nullable = false)
	private String code;
	@Lob
	@Column(name="IMAGE", length=Integer.MAX_VALUE, nullable = true)
	private byte[] image;
	@Column(name="NAME", length=255, nullable = false)
	private String name;
	@Column(name="PRICE", nullable = false)
	private double price;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE", nullable = false)
	private Date createDate;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
