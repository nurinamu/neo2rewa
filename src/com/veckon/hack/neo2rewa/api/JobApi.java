package com.veckon.hack.neo2rewa.api;

import static com.veckon.hack.neo2rewa.objectify.OfyService.ofy;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.DefaultValue;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.veckon.hack.neo2rewa.datastore.Result;
import com.veckon.hack.neo2rewa.datastore.Job;

@Api(name="neo2rewa",version="v1")
public class JobApi {
	@ApiMethod(path="/job",httpMethod=HttpMethod.GET)
	public List<Job> findAll(@Named(value="type") @DefaultValue(value="") String type){
		if("".equals(type)){
			return ofy().load().type(Job.class).list();
		}else{
			return ofy().load().type(Job.class).filter("type", type).list();
		}
	}
	@ApiMethod(path="/job/{id}",httpMethod=HttpMethod.GET)
	public Job findOne(@Named("id") String id){
		return ofy().load().type(Job.class).filterKey(id).first().now();
	}
	
	@ApiMethod(path="/job",httpMethod=HttpMethod.POST)
	public Result save(Job job){
		ofy().save().entity(job).now();
		Job getJob = ofy().load().entity(job).now();
		if(getJob != null){
			return new Result("success",job.getId());
		}else{
			return new Result("fail","confirm App Engine Server");
		}
	}

	@ApiMethod(path="/job",httpMethod=HttpMethod.DELETE)
	public Result delete(@Named("id") String id){
		ofy().delete().type(Job.class).id(Long.parseLong(id)).now();
		Job getJob = ofy().load().type(Job.class).filterKey(id).first().now();
		if(getJob == null){
			return new Result("success",id);
		}else{
			return new Result("fail","confirm App Engine Server");
		}
	}
}
