package com.fyayc.micro.apiextension.service;

import javax.json.JsonObject;

public class CartService {
	public boolean validateMaximumNumberOfThreeCartItems (JsonObject cart) {
		int size = cart.getJsonObject("resource").getJsonObject("obj").getJsonArray("lineItems").size();
		return size<=3;
	}
}
