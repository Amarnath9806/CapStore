package com.cg.capStore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Return {
 @Id
 //@GeneratedValue(generator="ref1",strategy=GenerationType.SEQUENCE)
 //@SequenceGenerator(initialValue=1, name = "ref1")
private int refundId;
 public int getProductQuantity() {
	return productQuantity;
}
public void setProductQuantity(int productQuantity) {
	this.productQuantity = productQuantity;
}
private int customerId;
 private int productQuantity;
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
private int productId;
private int orderId;
private int productPrice;
public int getRefundId() {
	return refundId;
}
public void setRefundId(int refundId) {
	this.refundId = refundId;
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
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}
}
