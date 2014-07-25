package com.veckon.hack.neo2rewa.api;

import static com.veckon.hack.neo2rewa.objectify.OfyService.ofy;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.DefaultValue;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.veckon.hack.neo2rewa.datastore.Result;
import com.veckon.hack.neo2rewa.datastore.Supply;

@Api(name="neo2rewa",version="v1")
public class SupplyApi {
	@ApiMethod(path="/supply",httpMethod=HttpMethod.GET)
	public List<Supply> findAll(@Named(value="type") @DefaultValue(value="") String type){
		if("".equals(type)){
			return ofy().load().type(Supply.class).list();
		}else{
			return ofy().load().type(Supply.class).filter("type", type).list();
		}
	}
	@ApiMethod(path="/supply/{id}",httpMethod=HttpMethod.GET)
	public Supply findOne(@Named("id") String id){
		return ofy().load().type(Supply.class).filterKey(Long.parseLong(id)).first().now();
	}
	
	@ApiMethod(path="/supply",httpMethod=HttpMethod.POST)
	public Result save(Supply supply){
		ofy().save().entity(supply).now();
		Supply getSupply = ofy().load().entity(supply).now();
		if(getSupply != null){
			return new Result("success",supply.getId());
		}else{
			return new Result("fail","confirm App Engine Server");
		}
	}

	@ApiMethod(path="/supply",httpMethod=HttpMethod.DELETE)
	public Result delete(@Named("id") String id){
		ofy().delete().type(Supply.class).id(Long.parseLong(id)).now();
		Supply getSupply = ofy().load().type(Supply.class).filterKey(id).first().now();
		if(getSupply == null){
			return new Result("success",id);
		}else{
			return new Result("fail","confirm App Engine Server");
		}
	}
}
