package com.veckon.hack.neo2rewa.datastore;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class EntityData {
    
    @Id
    String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
