package com.adanac.tool.rageon.intf.test;

import java.io.Serializable;

public class ShopItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5084580866225330536L;
	private Product product;
	private int quantity;

	public ShopItem(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ShopItem [product=" + product + ", quantity=" + quantity + "]";
	}

}
