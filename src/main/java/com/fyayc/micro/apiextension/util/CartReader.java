package com.fyayc.micro.apiextension.util;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class CartReader {
	public static JsonObject readCart(String json) {
		 JsonReader reader = Json.createReader(new StringReader(json));
		 JsonObject cart = reader.readObject();
		 reader.close();
		 return cart;
	}
}
