package com.veckon.hack.neo2rewa.api;

import static com.veckon.hack.neo2rewa.objectify.OfyService.ofy;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.veckon.hack.neo2rewa.datastore.Login;
import com.veckon.hack.neo2rewa.datastore.User;

@Api(name="neo2rewa",version="v1")
public class LoginApi {
	
	@ApiMethod(path="/logout",httpMethod=HttpMethod.GET)
	public void logout(){
	
	}

@ApiMethod(path="/login",httpMethod=HttpMethod.POST)
	public Login login(User user){
		User userinfo = ofy().load().type(User.class).filter("email==", user.getName()).first().now();
		if(userinfo == null) {
			return new Login(false,"fail","not exist loginid");
		}
		if(!userinfo.getPassword().equals(user.getPassword())) {
			return new Login(false,"fail","not correct password");
		}
		return new Login(true,"success",null);
	}
}
