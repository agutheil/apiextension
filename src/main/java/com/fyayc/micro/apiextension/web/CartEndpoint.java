package com.fyayc.micro.apiextension.web;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("cart")
@RequestScoped
public class CartEndpoint {
	 @POST
	 @Consumes(MediaType.APPLICATION_JSON)
	 public Response add(String body) {
		 System.out.println(body);
		 return Response.ok().build();
	 }
}
