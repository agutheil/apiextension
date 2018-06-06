package com.fyayc.micro.apiextension.service;

import static org.junit.Assert.*;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import org.junit.Test;

public class CartServiceTest {
	
	@Test
	public void thatValidates() {
		 JsonReader reader = Json.createReader(new StringReader(cartString));
		 JsonObject cart = reader.readObject();
		 reader.close();
		 CartService cs = new CartService();
		 boolean valid = cs.validateMaximumNumberOfThreeCartItems(cart);
		 assertTrue(valid);
	}
	
	@Test
	public void thatValidationFails() {
		 JsonReader reader = Json.createReader(new StringReader(failingCartString));
		 JsonObject cart = reader.readObject();
		 reader.close();
		 CartService cs = new CartService();
		 boolean valid = cs.validateMaximumNumberOfThreeCartItems(cart);
		 assertFalse(valid);
	}
	
	public static String cartString = "{\n" + 
			"  \"action\": \"Create\",\n" + 
			"  \"resource\": {\n" + 
			"    \"typeId\": \"cart\",\n" + 
			"    \"id\": \"383f3057-b1a1-4a06-ade9-fb60541708ae\",\n" + 
			"    \"obj\": {\n" + 
			"      \"type\": \"Cart\",\n" + 
			"      \"id\": \"383f3057-b1a1-4a06-ade9-fb60541708ae\",\n" + 
			"      \"version\": 1,\n" + 
			"      \"anonymousId\": \"a1e8b1f2-5d12-4d3f-8709-368047490aac\",\n" + 
			"      \"createdAt\": \"1970-01-01T00:00:00.000Z\",\n" + 
			"      \"lastModifiedAt\": \"1970-01-01T00:00:00.000Z\",\n" + 
			"      \"lineItems\": [\n" + 
			"        {\n" + 
			"          \"id\": \"db804055-4f79-473f-898e-bd045f04a141\",\n" + 
			"          \"productId\": \"bb06aab5-a67f-4be5-8b91-348737895669\",\n" + 
			"          \"name\": {\n" + 
			"            \"en\": \"MB SOFTSHELL LINER\"\n" + 
			"          },\n" + 
			"          \"productType\": {\n" + 
			"            \"typeId\": \"product-type\",\n" + 
			"            \"id\": \"fbbf3992-84a9-41a0-8ed0-fc2f2bc0fc21\",\n" + 
			"            \"version\": 2\n" + 
			"          },\n" + 
			"          \"productSlug\": {\n" + 
			"            \"en\": \"mb-softshell-liner1527067894980\"\n" + 
			"          },\n" + 
			"          \"variant\": {\n" + 
			"            \"id\": 1,\n" + 
			"            \"sku\": \"sku_MB_SOFTSHELL_LINER_variant1_1527067894980\",\n" + 
			"            \"prices\": [\n" + 
			"              {\n" + 
			"                \"value\": {\n" + 
			"                  \"type\": \"centPrecision\",\n" + 
			"                  \"currencyCode\": \"EUR\",\n" + 
			"                  \"centAmount\": 10000,\n" + 
			"                  \"fractionDigits\": 2\n" + 
			"                },\n" + 
			"                \"id\": \"2b6e7aa5-bb9c-44ea-b87b-285774abe3f8\"\n" + 
			"              }\n" + 
			"            ],\n" + 
			"            \"images\": [\n" + 
			"              {\n" + 
			"                \"url\": \"https://www.commercetools.com/cli/data/254391631_1.jpg\",\n" + 
			"                \"dimensions\": {\n" + 
			"                  \"w\": 1400,\n" + 
			"                  \"h\": 1400\n" + 
			"                }\n" + 
			"              }\n" + 
			"            ],\n" + 
			"            \"attributes\": [],\n" + 
			"            \"assets\": []\n" + 
			"          },\n" + 
			"          \"price\": {\n" + 
			"            \"value\": {\n" + 
			"              \"type\": \"centPrecision\",\n" + 
			"              \"currencyCode\": \"EUR\",\n" + 
			"              \"centAmount\": 10000,\n" + 
			"              \"fractionDigits\": 2\n" + 
			"            },\n" + 
			"            \"id\": \"2b6e7aa5-bb9c-44ea-b87b-285774abe3f8\"\n" + 
			"          },\n" + 
			"          \"quantity\": 15,\n" + 
			"          \"discountedPricePerQuantity\": [],\n" + 
			"          \"state\": [\n" + 
			"            {\n" + 
			"              \"quantity\": 15,\n" + 
			"              \"state\": {\n" + 
			"                \"typeId\": \"state\",\n" + 
			"                \"id\": \"20adc3f7-93c2-43f7-bf9b-3db92425e7f1\"\n" + 
			"              }\n" + 
			"            }\n" + 
			"          ],\n" + 
			"          \"priceMode\": \"Platform\",\n" + 
			"          \"totalPrice\": {\n" + 
			"            \"type\": \"centPrecision\",\n" + 
			"            \"currencyCode\": \"EUR\",\n" + 
			"            \"centAmount\": 150000,\n" + 
			"            \"fractionDigits\": 2\n" + 
			"          },\n" + 
			"          \"lineItemMode\": \"Standard\"\n" + 
			"        }\n" + 
			"      ],\n" + 
			"      \"cartState\": \"Active\",\n" + 
			"      \"totalPrice\": {\n" + 
			"        \"type\": \"centPrecision\",\n" + 
			"        \"currencyCode\": \"EUR\",\n" + 
			"        \"centAmount\": 150000,\n" + 
			"        \"fractionDigits\": 2\n" + 
			"      },\n" + 
			"      \"country\": \"DE\",\n" + 
			"      \"customLineItems\": [],\n" + 
			"      \"discountCodes\": [],\n" + 
			"      \"inventoryMode\": \"None\",\n" + 
			"      \"taxMode\": \"Platform\",\n" + 
			"      \"taxRoundingMode\": \"HalfEven\",\n" + 
			"      \"taxCalculationMode\": \"LineItemLevel\",\n" + 
			"      \"refusedGifts\": [],\n" + 
			"      \"origin\": \"Customer\",\n" + 
			"      \"itemShippingAddresses\": []\n" + 
			"    }\n" + 
			"  }\n" + 
			"}";
	
	public static String failingCartString = "{\n" + 
			"  \"action\": \"Create\",\n" + 
			"  \"resource\": {\n" + 
			"    \"typeId\": \"cart\",\n" + 
			"    \"id\": \"383f3057-b1a1-4a06-ade9-fb60541708ae\",\n" + 
			"    \"obj\": {\n" + 
			"      \"type\": \"Cart\",\n" + 
			"      \"id\": \"383f3057-b1a1-4a06-ade9-fb60541708ae\",\n" + 
			"      \"version\": 1,\n" + 
			"      \"anonymousId\": \"a1e8b1f2-5d12-4d3f-8709-368047490aac\",\n" + 
			"      \"createdAt\": \"1970-01-01T00:00:00.000Z\",\n" + 
			"      \"lastModifiedAt\": \"1970-01-01T00:00:00.000Z\",\n" + 
			"      \"lineItems\": [\n" + 
			"        {\n" + 
			"          \"id\": \"db804055-4f79-473f-898e-bd045f04a141\",\n" + 
			"          \"productId\": \"bb06aab5-a67f-4be5-8b91-348737895669\",\n" + 
			"          \"name\": {\n" + 
			"            \"en\": \"MB SOFTSHELL LINER\"\n" + 
			"          },\n" + 
			"          \"productType\": {\n" + 
			"            \"typeId\": \"product-type\",\n" + 
			"            \"id\": \"fbbf3992-84a9-41a0-8ed0-fc2f2bc0fc21\",\n" + 
			"            \"version\": 2\n" + 
			"          },\n" + 
			"          \"productSlug\": {\n" + 
			"            \"en\": \"mb-softshell-liner1527067894980\"\n" + 
			"          },\n" + 
			"          \"variant\": {\n" + 
			"            \"id\": 1,\n" + 
			"            \"sku\": \"sku_MB_SOFTSHELL_LINER_variant1_1527067894980\",\n" + 
			"            \"prices\": [\n" + 
			"              {\n" + 
			"                \"value\": {\n" + 
			"                  \"type\": \"centPrecision\",\n" + 
			"                  \"currencyCode\": \"EUR\",\n" + 
			"                  \"centAmount\": 10000,\n" + 
			"                  \"fractionDigits\": 2\n" + 
			"                },\n" + 
			"                \"id\": \"2b6e7aa5-bb9c-44ea-b87b-285774abe3f8\"\n" + 
			"              }\n" + 
			"            ],\n" + 
			"            \"images\": [\n" + 
			"              {\n" + 
			"                \"url\": \"https://www.commercetools.com/cli/data/254391631_1.jpg\",\n" + 
			"                \"dimensions\": {\n" + 
			"                  \"w\": 1400,\n" + 
			"                  \"h\": 1400\n" + 
			"                }\n" + 
			"              }\n" + 
			"            ],\n" + 
			"            \"attributes\": [],\n" + 
			"            \"assets\": []\n" + 
			"          },\n" + 
			"          \"price\": {\n" + 
			"            \"value\": {\n" + 
			"              \"type\": \"centPrecision\",\n" + 
			"              \"currencyCode\": \"EUR\",\n" + 
			"              \"centAmount\": 10000,\n" + 
			"              \"fractionDigits\": 2\n" + 
			"            },\n" + 
			"            \"id\": \"2b6e7aa5-bb9c-44ea-b87b-285774abe3f8\"\n" + 
			"          },\n" + 
			"          \"quantity\": 15,\n" + 
			"          \"discountedPricePerQuantity\": [],\n" + 
			"          \"state\": [\n" + 
			"            {\n" + 
			"              \"quantity\": 15,\n" + 
			"              \"state\": {\n" + 
			"                \"typeId\": \"state\",\n" + 
			"                \"id\": \"20adc3f7-93c2-43f7-bf9b-3db92425e7f1\"\n" + 
			"              }\n" + 
			"            }\n" + 
			"          ],\n" + 
			"          \"priceMode\": \"Platform\",\n" + 
			"          \"totalPrice\": {\n" + 
			"            \"type\": \"centPrecision\",\n" + 
			"            \"currencyCode\": \"EUR\",\n" + 
			"            \"centAmount\": 150000,\n" + 
			"            \"fractionDigits\": 2\n" + 
			"          },\n" + 
			"          \"lineItemMode\": \"Standard\"\n" + 
			"        },\n" + 
			"        {\n" + 
			"          \"id\": \"db804055-4f79-473f-898e-bd045f04a141\",\n" + 
			"          \"productId\": \"bb06aab5-a67f-4be5-8b91-348737895669\",\n" + 
			"          \"name\": {\n" + 
			"            \"en\": \"MB SOFTSHELL LINER\"\n" + 
			"          },\n" + 
			"          \"productType\": {\n" + 
			"            \"typeId\": \"product-type\",\n" + 
			"            \"id\": \"fbbf3992-84a9-41a0-8ed0-fc2f2bc0fc21\",\n" + 
			"            \"version\": 2\n" + 
			"          },\n" + 
			"          \"productSlug\": {\n" + 
			"            \"en\": \"mb-softshell-liner1527067894980\"\n" + 
			"          },\n" + 
			"          \"variant\": {\n" + 
			"            \"id\": 1,\n" + 
			"            \"sku\": \"sku_MB_SOFTSHELL_LINER_variant1_1527067894980\",\n" + 
			"            \"prices\": [\n" + 
			"              {\n" + 
			"                \"value\": {\n" + 
			"                  \"type\": \"centPrecision\",\n" + 
			"                  \"currencyCode\": \"EUR\",\n" + 
			"                  \"centAmount\": 10000,\n" + 
			"                  \"fractionDigits\": 2\n" + 
			"                },\n" + 
			"                \"id\": \"2b6e7aa5-bb9c-44ea-b87b-285774abe3f8\"\n" + 
			"              }\n" + 
			"            ],\n" + 
			"            \"images\": [\n" + 
			"              {\n" + 
			"                \"url\": \"https://www.commercetools.com/cli/data/254391631_1.jpg\",\n" + 
			"                \"dimensions\": {\n" + 
			"                  \"w\": 1400,\n" + 
			"                  \"h\": 1400\n" + 
			"                }\n" + 
			"              }\n" + 
			"            ],\n" + 
			"            \"attributes\": [],\n" + 
			"            \"assets\": []\n" + 
			"          },\n" + 
			"          \"price\": {\n" + 
			"            \"value\": {\n" + 
			"              \"type\": \"centPrecision\",\n" + 
			"              \"currencyCode\": \"EUR\",\n" + 
			"              \"centAmount\": 10000,\n" + 
			"              \"fractionDigits\": 2\n" + 
			"            },\n" + 
			"            \"id\": \"2b6e7aa5-bb9c-44ea-b87b-285774abe3f8\"\n" + 
			"          },\n" + 
			"          \"quantity\": 15,\n" + 
			"          \"discountedPricePerQuantity\": [],\n" + 
			"          \"state\": [\n" + 
			"            {\n" + 
			"              \"quantity\": 15,\n" + 
			"              \"state\": {\n" + 
			"                \"typeId\": \"state\",\n" + 
			"                \"id\": \"20adc3f7-93c2-43f7-bf9b-3db92425e7f1\"\n" + 
			"              }\n" + 
			"            }\n" + 
			"          ],\n" + 
			"          \"priceMode\": \"Platform\",\n" + 
			"          \"totalPrice\": {\n" + 
			"            \"type\": \"centPrecision\",\n" + 
			"            \"currencyCode\": \"EUR\",\n" + 
			"            \"centAmount\": 150000,\n" + 
			"            \"fractionDigits\": 2\n" + 
			"          },\n" + 
			"          \"lineItemMode\": \"Standard\"\n" + 
			"        },\n" + 
			"        {\n" + 
			"          \"id\": \"db804055-4f79-473f-898e-bd045f04a141\",\n" + 
			"          \"productId\": \"bb06aab5-a67f-4be5-8b91-348737895669\",\n" + 
			"          \"name\": {\n" + 
			"            \"en\": \"MB SOFTSHELL LINER\"\n" + 
			"          },\n" + 
			"          \"productType\": {\n" + 
			"            \"typeId\": \"product-type\",\n" + 
			"            \"id\": \"fbbf3992-84a9-41a0-8ed0-fc2f2bc0fc21\",\n" + 
			"            \"version\": 2\n" + 
			"          },\n" + 
			"          \"productSlug\": {\n" + 
			"            \"en\": \"mb-softshell-liner1527067894980\"\n" + 
			"          },\n" + 
			"          \"variant\": {\n" + 
			"            \"id\": 1,\n" + 
			"            \"sku\": \"sku_MB_SOFTSHELL_LINER_variant1_1527067894980\",\n" + 
			"            \"prices\": [\n" + 
			"              {\n" + 
			"                \"value\": {\n" + 
			"                  \"type\": \"centPrecision\",\n" + 
			"                  \"currencyCode\": \"EUR\",\n" + 
			"                  \"centAmount\": 10000,\n" + 
			"                  \"fractionDigits\": 2\n" + 
			"                },\n" + 
			"                \"id\": \"2b6e7aa5-bb9c-44ea-b87b-285774abe3f8\"\n" + 
			"              }\n" + 
			"            ],\n" + 
			"            \"images\": [\n" + 
			"              {\n" + 
			"                \"url\": \"https://www.commercetools.com/cli/data/254391631_1.jpg\",\n" + 
			"                \"dimensions\": {\n" + 
			"                  \"w\": 1400,\n" + 
			"                  \"h\": 1400\n" + 
			"                }\n" + 
			"              }\n" + 
			"            ],\n" + 
			"            \"attributes\": [],\n" + 
			"            \"assets\": []\n" + 
			"          },\n" + 
			"          \"price\": {\n" + 
			"            \"value\": {\n" + 
			"              \"type\": \"centPrecision\",\n" + 
			"              \"currencyCode\": \"EUR\",\n" + 
			"              \"centAmount\": 10000,\n" + 
			"              \"fractionDigits\": 2\n" + 
			"            },\n" + 
			"            \"id\": \"2b6e7aa5-bb9c-44ea-b87b-285774abe3f8\"\n" + 
			"          },\n" + 
			"          \"quantity\": 15,\n" + 
			"          \"discountedPricePerQuantity\": [],\n" + 
			"          \"state\": [\n" + 
			"            {\n" + 
			"              \"quantity\": 15,\n" + 
			"              \"state\": {\n" + 
			"                \"typeId\": \"state\",\n" + 
			"                \"id\": \"20adc3f7-93c2-43f7-bf9b-3db92425e7f1\"\n" + 
			"              }\n" + 
			"            }\n" + 
			"          ],\n" + 
			"          \"priceMode\": \"Platform\",\n" + 
			"          \"totalPrice\": {\n" + 
			"            \"type\": \"centPrecision\",\n" + 
			"            \"currencyCode\": \"EUR\",\n" + 
			"            \"centAmount\": 150000,\n" + 
			"            \"fractionDigits\": 2\n" + 
			"          },\n" + 
			"          \"lineItemMode\": \"Standard\"\n" + 
			"        },\n" + 
			"        {\n" + 
			"          \"id\": \"db804055-4f79-473f-898e-bd045f04a141\",\n" + 
			"          \"productId\": \"bb06aab5-a67f-4be5-8b91-348737895669\",\n" + 
			"          \"name\": {\n" + 
			"            \"en\": \"MB SOFTSHELL LINER\"\n" + 
			"          },\n" + 
			"          \"productType\": {\n" + 
			"            \"typeId\": \"product-type\",\n" + 
			"            \"id\": \"fbbf3992-84a9-41a0-8ed0-fc2f2bc0fc21\",\n" + 
			"            \"version\": 2\n" + 
			"          },\n" + 
			"          \"productSlug\": {\n" + 
			"            \"en\": \"mb-softshell-liner1527067894980\"\n" + 
			"          },\n" + 
			"          \"variant\": {\n" + 
			"            \"id\": 1,\n" + 
			"            \"sku\": \"sku_MB_SOFTSHELL_LINER_variant1_1527067894980\",\n" + 
			"            \"prices\": [\n" + 
			"              {\n" + 
			"                \"value\": {\n" + 
			"                  \"type\": \"centPrecision\",\n" + 
			"                  \"currencyCode\": \"EUR\",\n" + 
			"                  \"centAmount\": 10000,\n" + 
			"                  \"fractionDigits\": 2\n" + 
			"                },\n" + 
			"                \"id\": \"2b6e7aa5-bb9c-44ea-b87b-285774abe3f8\"\n" + 
			"              }\n" + 
			"            ],\n" + 
			"            \"images\": [\n" + 
			"              {\n" + 
			"                \"url\": \"https://www.commercetools.com/cli/data/254391631_1.jpg\",\n" + 
			"                \"dimensions\": {\n" + 
			"                  \"w\": 1400,\n" + 
			"                  \"h\": 1400\n" + 
			"                }\n" + 
			"              }\n" + 
			"            ],\n" + 
			"            \"attributes\": [],\n" + 
			"            \"assets\": []\n" + 
			"          },\n" + 
			"          \"price\": {\n" + 
			"            \"value\": {\n" + 
			"              \"type\": \"centPrecision\",\n" + 
			"              \"currencyCode\": \"EUR\",\n" + 
			"              \"centAmount\": 10000,\n" + 
			"              \"fractionDigits\": 2\n" + 
			"            },\n" + 
			"            \"id\": \"2b6e7aa5-bb9c-44ea-b87b-285774abe3f8\"\n" + 
			"          },\n" + 
			"          \"quantity\": 15,\n" + 
			"          \"discountedPricePerQuantity\": [],\n" + 
			"          \"state\": [\n" + 
			"            {\n" + 
			"              \"quantity\": 15,\n" + 
			"              \"state\": {\n" + 
			"                \"typeId\": \"state\",\n" + 
			"                \"id\": \"20adc3f7-93c2-43f7-bf9b-3db92425e7f1\"\n" + 
			"              }\n" + 
			"            }\n" + 
			"          ],\n" + 
			"          \"priceMode\": \"Platform\",\n" + 
			"          \"totalPrice\": {\n" + 
			"            \"type\": \"centPrecision\",\n" + 
			"            \"currencyCode\": \"EUR\",\n" + 
			"            \"centAmount\": 150000,\n" + 
			"            \"fractionDigits\": 2\n" + 
			"          },\n" + 
			"          \"lineItemMode\": \"Standard\"\n" + 
			"        }\n" + 
			"      ],\n" + 
			"      \"cartState\": \"Active\",\n" + 
			"      \"totalPrice\": {\n" + 
			"        \"type\": \"centPrecision\",\n" + 
			"        \"currencyCode\": \"EUR\",\n" + 
			"        \"centAmount\": 150000,\n" + 
			"        \"fractionDigits\": 2\n" + 
			"      },\n" + 
			"      \"country\": \"DE\",\n" + 
			"      \"customLineItems\": [],\n" + 
			"      \"discountCodes\": [],\n" + 
			"      \"inventoryMode\": \"None\",\n" + 
			"      \"taxMode\": \"Platform\",\n" + 
			"      \"taxRoundingMode\": \"HalfEven\",\n" + 
			"      \"taxCalculationMode\": \"LineItemLevel\",\n" + 
			"      \"refusedGifts\": [],\n" + 
			"      \"origin\": \"Customer\",\n" + 
			"      \"itemShippingAddresses\": []\n" + 
			"    }\n" + 
			"  }\n" + 
			"}";

}
