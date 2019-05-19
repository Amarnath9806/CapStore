package com.cg.capStore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Refund {
	@Id
	//@GeneratedValue(generator="ref1",strategy=GenerationType.SEQUENCE)
	 //@SequenceGenerator(initialValue=1, name = "ref1")
	@GeneratedValue(generator="cust1",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="cust1",sequenceName="RefundMoney1",initialValue=13000,allocationSize=1)
private int transactionId;
private int refundId;
private int customerId;
private int productId;
private int orderId;
private int productPrice;
private int productQuantity;
public int getProductQuantity() {
	return productQuantity;
}
public void setProductQuantity(int productQuantity) {
	this.productQuantity = productQuantity;
}
public int getTransactionId() {
	return transactionId;
}
public void setTransactionId(int transactionId) {
	this.transactionId = transactionId;
}
public int getRefundId() {
	return refundId;
}
public void setRefundId(int refundId) {
	this.refundId = refundId;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public int getProductPrice() {
	return productPrice;
}
public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}
}
