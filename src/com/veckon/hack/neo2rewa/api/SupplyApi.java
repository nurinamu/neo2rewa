package com.veckon.hack.neo2rewa.api;

import static com.veckon.hack.neo2rewa.objectify.OfyService.ofy;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.veckon.hack.neo2rewa.datastore.Supply;

@Api(name="supplyApi",version="v1")
public class SupplyApi {
	@ApiMethod(path="/supply",httpMethod=HttpMethod.GET)
	public List<Supply> findAll(@Named("id") String id){
		return ofy().load().type(Supply.class).list();
	}
	@ApiMethod(path="/supply/{id}",httpMethod=HttpMethod.GET)
	public Supply findOne(@Named("id") String id){
		return ofy().load().type(Supply.class).filterKey(Long.parseLong(id)).first().now();
	}
	
	@ApiMethod(path="/supply",httpMethod=HttpMethod.POST)
	public void save(Supply supply){
		ofy().save().entity(supply).now();
	}

	@ApiMethod(path="/supply",httpMethod=HttpMethod.DELETE)
	public void delete(@Named("id") String id){
		ofy().delete().type(Supply.class).id(Long.parseLong(id)).now();
	}
}
