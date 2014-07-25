package com.veckon.hack.neo2rewa.datastore;

import com.google.appengine.api.datastore.Text;

public class Supply extends EntityData{
    String name;
    SupplyType type;
    Text description;
    
    public enum SupplyType{
        DRINGKING, FOOD, CLOTH, MEDICINE, ETC 
    }
}
