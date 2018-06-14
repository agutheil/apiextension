package com.fyayc.micro.apiextension.web;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.fyayc.micro.apiextension.service.CartService;
import com.fyayc.micro.apiextension.util.CartReader;

@Path("cart")
@RequestScoped
public class CartEndpoint {
	@Inject 
	CartService cartService;
	
	
	 @POST
	 @Consumes(MediaType.APPLICATION_JSON)
	 public Response add(String body) {
		 System.out.println(body);
		 if (cartService.validateMaximumNumberOfThreeCartItems(CartReader.readCart(body))) {
			 return Response.ok().build();
		 } else {
			 return Response.status(Status.BAD_REQUEST).entity(new BadRequestModel("InvalidInput", "You can not put more than 3 items into the cart.")).build();
		 }
		 
	 }
}
