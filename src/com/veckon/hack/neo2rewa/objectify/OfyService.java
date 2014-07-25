package com.veckon.hack.neo2rewa.objectify;

import com.googlecode.objectify.ObjectifyService;

public class OfyService {

	static{
		
	}
	
	public static Ofy ofy(){
		return (Ofy) ObjectifyService.ofy();
	}
	public static OfyFactory factory(){
		return (OfyFactory) ObjectifyService.factory();
	}
}
