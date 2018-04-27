package btm.training.springboot.shoponline.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_DETAILS")
public class OrderDetail implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ID", length=50, nullable = false)
	private String id;
	@Column(name="AMOUNT", nullable = false)
	private double amount;
	@Column(name="PRICE", nullable = false)
	private double price;
	@Column(name="QUANTITY", nullable = false)
	private int quanity;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ORDER_ID", nullable = false, foreignKey=@ForeignKey(name="ORDER_DETAIL_ORD_FK"))
	private Order order;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PRODUCT_ID", nullable = false, foreignKey=@ForeignKey(name="ORDER_DETAIL_PROD_FK"))
	private Product product;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuanity() {
		return quanity;
	}
	public void setQuanity(int quantity) {
		this.quanity = quantity;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order oder) {
		this.order = oder;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
}
