package com.veckon.hack.neo2rewa.api;

import static com.veckon.hack.neo2rewa.objectify.OfyService.ofy;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.config.Named;
import com.veckon.hack.neo2rewa.datastore.Disaster;

@Api(name="disasterApi",
	version ="v1")
public class DisasterApi {
	@ApiMethod(name="getAll", path="/disaster",httpMethod=HttpMethod.GET)
	public List<Disaster> findAll(@Named("id") String id){
		return ofy().load().type(Disaster.class).list();
	}
	@ApiMethod(name="get",path="/disaster/{id}",httpMethod=HttpMethod.GET)
	public Disaster findOne(@Named("id") String id){
		return ofy().load().type(Disaster.class).filterKey(Long.parseLong(id)).first().now();
	}
	
	@ApiMethod(name="save",path="/disaster",httpMethod=HttpMethod.POST)
	public void save(Disaster disaster){
		ofy().save().entity(disaster).now();
	}

	@ApiMethod(name="delete",path="/disaster",httpMethod=HttpMethod.DELETE)
	public void delete(@Named("id") String id){
		ofy().delete().type(Disaster.class).id(Long.parseLong(id)).now();
	}
}
