package com.veckon.hack.neo2rewa.datastore;


public class Result {
    
	private String status;
	private String message;
	
	public Result(String status,String message) {
		this.status = status;
		this.message = message;
	}

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
	
//	public Result<T> getResult(T t){
//		T entity = ofy().load().entity(t).now();
//		if(entity != null){
//			return new Result<T>(typeOf,"success",entity.getId());
//		}else{
//			return new Result<T>(typeOf,"fail","confirm App Engine Server");
//		}
//	}
//	
//	public Result<T> getResult(String id){
//		T entity = ofy().load().type(typeOf).filter("name",id).first().now();
//		if(entity != null){
//			return new Result<T>(typeOf,"success",entity.getId());
//		}else{
//			return new Result<T>(typeOf,"fail","confirm App Engine Server");
//		}
//	}
}
