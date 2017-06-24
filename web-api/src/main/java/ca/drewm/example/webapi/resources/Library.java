package ca.drewm.example.webapi.resources;

import ca.drewm.example.webapi.models.Book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Path("/library")
public class Library {
	private List<Book> books = new ArrayList<>();

	public Library() {
		books.add(new Book("Drew Matheson", "Jetty + RESTEasy", LocalDate.of(2017, Month.JUNE, 24)));
		books.add(new Book("Drew Matheson", "Jetty Embedded with RESTEasy automatic scanning", LocalDate.now()));
	}

	@GET
	@Path("/books")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> getBooks() {
		return books;
	}

	@GET
	@Path("/hello")
	@Produces(MediaType.APPLICATION_JSON)
	public Response helloWorld() {
		return Response.status(200).entity("hello world!").build();
	}
}