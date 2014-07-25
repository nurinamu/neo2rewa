package com.veckon.hack.neo2rewa.datastore;

import java.util.List;
import java.util.Map;

import com.google.appengine.api.datastore.Text;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.EmbedMap;
import com.googlecode.objectify.annotation.Entity;


@Entity
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

    public long getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(long issueDate) {
        this.issueDate = issueDate;
    }

    public long getGeoX() {
        return geoX;
    }

    public void setGeoX(long geoX) {
        this.geoX = geoX;
    }

    public long getGeoY() {
        return geoY;
    }

    public void setGeoY(long geoY) {
        this.geoY = geoY;
    }

    public Text getDescription() {
        return description;
    }

    public void setDescription(Text description) {
        this.description = description;
    }

    public DisasterType getType() {
        return type;
    }

    public void setType(DisasterType type) {
        this.type = type;
    }

    public Map<Key<Supply>, Long> getNeedSupplies() {
        return needSupplies;
    }

    public void setNeedSupplies(Map<Key<Supply>, Long> needSupplies) {
        this.needSupplies = needSupplies;
    }

    public Map<Key<Supply>, Long> getHaveSupplies() {
        return haveSupplies;
    }

    public void setHaveSupplies(Map<Key<Supply>, Long> haveSupplies) {
        this.haveSupplies = haveSupplies;
    }

    public Map<Key<Supply>, Long> getUsedSupplies() {
        return usedSupplies;
    }

    public void setUsedSupplies(Map<Key<Supply>, Long> usedSupplies) {
        this.usedSupplies = usedSupplies;
    }

    public Map<String, List<User>> getNeedVolunteers() {
        return needVolunteers;
    }

    public void setNeedVolunteers(Map<String, List<User>> needVolunteers) {
        this.needVolunteers = needVolunteers;
    }

    public Map<String, List<User>> getHaveVolunteers() {
        return haveVolunteers;
    }

    public void setHaveVolunteers(Map<String, List<User>> haveVolunteers) {
        this.haveVolunteers = haveVolunteers;
    }

    public Map<String, List<User>> getActiveVolunteers() {
        return activeVolunteers;
    }

    public void setActiveVolunteers(Map<String, List<User>> activeVolunteers) {
        this.activeVolunteers = activeVolunteers;
    }

    public Map<String, List<User>> getQuitVolunteers() {
        return quitVolunteers;
    }

    public void setQuitVolunteers(Map<String, List<User>> quitVolunteers) {
        this.quitVolunteers = quitVolunteers;
    }
}
