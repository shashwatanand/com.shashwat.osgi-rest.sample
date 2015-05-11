package com.shashwat.osgi_rest.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/sample")
public class RestResource {
	
	@GET
	public String getSampleContent() {
		return "Hi from RestResource class";
	}
}
