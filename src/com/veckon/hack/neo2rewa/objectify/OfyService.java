package com.veckon.hack.neo2rewa.objectify;


import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import com.veckon.hack.neo2rewa.datastore.Disaster;
import com.veckon.hack.neo2rewa.datastore.Job;
import com.veckon.hack.neo2rewa.datastore.Supply;
import com.veckon.hack.neo2rewa.datastore.User;
import com.veckon.hack.neo2rewa.datastore.VolunteerLog;

public class OfyService {

	static{
		ObjectifyService.register(User.class);
		ObjectifyService.register(Supply.class);
		ObjectifyService.register(Disaster.class);
		ObjectifyService.register(VolunteerLog.class);
		ObjectifyService.register(Job.class);
	}
	
	public static Objectify ofy(){
		return ObjectifyService.ofy();
	}
	public static ObjectifyFactory factory(){
		return ObjectifyService.factory();
	}
}
