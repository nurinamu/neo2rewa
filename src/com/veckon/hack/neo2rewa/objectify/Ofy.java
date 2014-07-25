package com.veckon.hack.neo2rewa.objectify;

import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.cmd.Loader;
import com.googlecode.objectify.impl.ObjectifyImpl;

public class Ofy extends ObjectifyImpl<Ofy>{

	public Ofy(ObjectifyFactory fact) {
		super(fact);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Loader load() {
		// TODO Auto-generated method stub
		return new OfyLoader(this);
	}

	
	
}
