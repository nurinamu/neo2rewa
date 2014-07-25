package com.veckon.hack.neo2rewa.config;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.servlet.SparkApplication;
import static spark.Spark.*;
public class AppConfig implements SparkApplication{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		get(new Route("/") {
			
			@Override
			public Object handle(Request req, Response resp) {
				// TODO Auto-generated method stub
				resp.body("This is First Page");
				return null;
			}
		});
	}

}
