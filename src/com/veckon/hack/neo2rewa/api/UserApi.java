package com.veckon.hack.neo2rewa.api;

import static com.veckon.hack.neo2rewa.objectify.OfyService.ofy;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.config.DefaultValue;
import com.google.api.server.spi.config.Named;
import com.googlecode.objectify.Key;
import com.veckon.hack.neo2rewa.datastore.Result;
import com.veckon.hack.neo2rewa.datastore.User;

@Api(name="neo2rewa",version="v1")
public class UserApi {
@ApiMethod(path="/user",httpMethod=HttpMethod.GET)
	public List<User> findAll(@Named(value="permission") @DefaultValue(value="") String permission){
		if("".equals(permission)){
			return ofy().load().type(User.class).list();
		}else{
			return ofy().load().type(User.class).filter("permission", permission).list();
		}
	}
	@ApiMethod(path="/user/{id}",httpMethod=HttpMethod.GET)
	public User findOne(@Named("id") String id){
		return ofy().load().type(User.class).filterKey(Long.parseLong(id)).first().now();
	}
	
	@ApiMethod(path="/user",httpMethod=HttpMethod.POST)
	public Result save(User user){
		Key<User> result = ofy().save().entity(user).now();
		
		if(result != null){
			return new Result("success",result.getString());
		}else{
			return new Result("fail","confirm App Engine Server");
		}
	}

	@ApiMethod(path="/user/{id}",httpMethod=HttpMethod.DELETE)
	public Result delete(@Named("id") String id){
		ofy().delete().type(User.class).id(Long.parseLong(id)).now();
		User getUser = ofy().load().type(User.class).filterKey(id).first().now();
		if(getUser == null){
			return new Result("success",id);
		}else{
			return new Result("fail","confirm App Engine Server");
		}
	}
}
