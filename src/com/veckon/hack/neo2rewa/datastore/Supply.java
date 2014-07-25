package com.veckon.hack.neo2rewa.datastore;

import com.google.appengine.api.datastore.Text;
import com.googlecode.objectify.annotation.Entity;

@Entity
public class Supply extends EntityData{
    String name;
    SupplyType type;
    Text description;
    
    public enum SupplyType{
        DRINGKING, FOOD, CLOTH, MEDICINE, ETC 
    }
}
