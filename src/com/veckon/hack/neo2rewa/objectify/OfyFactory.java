package com.veckon.hack.neo2rewa.objectify;

import javax.inject.Singleton;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;

@Singleton
public class OfyFactory extends ObjectifyFactory{
	
	public OfyFactory(){
		
	}
	@Override
	public Objectify begin() {
		// TODO Auto-generated method stub
		return new Ofy(this);
	}

	
}
