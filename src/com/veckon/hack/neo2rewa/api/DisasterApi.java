package com.veckon.hack.neo2rewa.api;

import static com.veckon.hack.neo2rewa.objectify.OfyService.ofy;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.config.Named;
import com.googlecode.objectify.Key;
import com.veckon.hack.neo2rewa.datastore.Disaster;
import com.veckon.hack.neo2rewa.datastore.Result;

@Api(name="neo2rewa",version="v1")
public class DisasterApi {
	@ApiMethod(path="/disaster",httpMethod=HttpMethod.GET)
	public List<Disaster> findAll(){
		return ofy().load().type(Disaster.class).list();
	}
	@ApiMethod(path="/disaster/{id}",httpMethod=HttpMethod.GET)
	public Disaster findOne(@Named("id") String id){
		return ofy().load().type(Disaster.class).filterKey(id).first().now();
	}
	
	@ApiMethod(path="/disaster",httpMethod=HttpMethod.POST)
	public Result save(Disaster disaster){
		Key<Disaster> result = ofy().save().entity(disaster).now();
		if(result != null){
			return new Result("success",result.getString());
		}else{
			return new Result("fail","confirm App Engine Server");
		}
	}

	@ApiMethod(path="/disaster",httpMethod=HttpMethod.DELETE)
	public Result delete(@Named("id") String id){
		ofy().delete().type(Disaster.class).id(Long.parseLong(id)).now();
		Disaster getUser = ofy().load().type(Disaster.class).filterKey(id).first().now();
		if(getUser == null){
			return new Result("success",id);
		}else{
			return new Result("fail","confirm App Engine Server");
		}
	}
}
