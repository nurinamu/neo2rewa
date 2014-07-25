package com.veckon.hack.neo2rewa.api;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.config.Named;
import com.veckon.hack.neo2rewa.datastore.User;

import static com.veckon.hack.neo2rewa.objectify.OfyService.ofy;

@Api(name="neo2rewa",version="v1")
public class UserApi {
@ApiMethod(path="/user",httpMethod=HttpMethod.GET)
	public List<User> findAll(){
		return ofy().load().type(User.class).list();
	}
	@ApiMethod(path="/user/{id}",httpMethod=HttpMethod.GET)
	public User findOne(@Named("id") String id){
		return ofy().load().type(User.class).filterKey(Long.parseLong(id)).first().now();
	}
	
	@ApiMethod(path="/user",httpMethod=HttpMethod.POST)
	public String save(User user){
		ofy().save().entity(user).now();
		User getUser = ofy().load().entity(user).now();
		if(getUser != null){
			return getUser.getName();
		}else{
			return "error";
		}
	}

	@ApiMethod(path="/user",httpMethod=HttpMethod.DELETE)
	public String delete(@Named("id") String id){
		ofy().delete().type(User.class).id(Long.parseLong(id)).now();
		return id;
	}
}
