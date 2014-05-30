package com.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**** Use full links:
https://www.youtube.com/watch?v=_AueeTNJsyk
http://www.vogella.com/tutorials/REST/article.html
--- create a rest ful web service
https://www.youtube.com/watch?v=qmEVsUJh2d8

We use Jaxb framework to dynamically generate the json or xml response
****/
@Path("/dictionary")
public class WordDictionary {
	

	// Test url -->
	// http://localhost:8080/RestDictionary/rest/dictionary/testword/
	// Here testword works as word
	@GET
	@Produces({ "application/json" })
	@Path("{word}")
	public String getWordDescription(@PathParam("word") String name) {
		// return Response.ok(name +" - "+"Description given").build();
		return name + " - " + "Description given";
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getWordDescription() {
		// return Response.ok(name +" - "+"Description given").build();
		return "Description givenmm";
	}
	// Test url -->
	// http://localhost:8080/RestDictionary/rest/dictionary/testword/desc
	// Make sure you use http PUT method to call this method
	@PUT
	@Produces({"application/json"})
	@Path("{word}/{desc}")
	public String putWordDesription(@PathParam("word") String name,
			@PathParam("desc") String desc) {
		return name + "- Your description : " + desc;
	}
}
