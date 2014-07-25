package com.veckon.hack.neo2rewa.datastore;

import com.google.appengine.api.datastore.Text;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;

@Entity
public class Supply extends EntityData{
    String name;
    
    @Index
    SupplyType type;
    
    Text description;
    
    public enum SupplyType{
        DRINKING, FOOD, CLOTH, MEDICINE, ETC 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SupplyType getType() {
        return type;
    }

    public void setType(SupplyType type) {
        this.type = type;
    }

    public Text getDescription() {
        return description;
    }

    public void setDescription(Text description) {
        this.description = description;
    }
}
