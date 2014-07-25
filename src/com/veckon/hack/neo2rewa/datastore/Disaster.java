package com.veckon.hack.neo2rewa.datastore;

import java.util.List;
import java.util.Map;

import com.google.appengine.api.datastore.Text;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.EmbedMap;


public class Disaster extends EntityData{
    
    long issueDate;
    long geoX;
    long geoY;
    Text description;
    DisasterType type;
    
    @EmbedMap
    Map<Key<Supply>, Long> needSupplies;
    
    @EmbedMap
    Map<Key<Supply>, Long> haveSupplies;
    
    @EmbedMap
    Map<Key<Supply>, Long> usedSupplies;
    
    @EmbedMap
    Map<String, List<User>> needVolunteers;
    
    @EmbedMap
    Map<String, List<User>> haveVolunteers;
    
    @EmbedMap
    Map<String, List<User>> activeVolunteers;
    
    @EmbedMap
    Map<String, List<User>> quitVolunteers;
    
    public enum DisasterType{
        NATURAL, ACCIDENT
    }
}
