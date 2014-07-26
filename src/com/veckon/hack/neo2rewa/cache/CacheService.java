package com.veckon.hack.neo2rewa.cache;

import com.google.appengine.api.memcache.AsyncMemcacheService;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;

public class CacheService {

	public static MemcacheService getMemcache(){
		return MemcacheServiceFactory.getMemcacheService();
	}
	
	public static AsyncMemcacheService getAsyncMemcache(){
			return MemcacheServiceFactory.getAsyncMemcacheService();
	}
}
