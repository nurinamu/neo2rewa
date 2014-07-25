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
    String geoX;
    String geoY;
    Text description;
    DisasterType type;
    Key<User> owner;
    String area;
    
    @EmbedMap
    Map<Key<Supply>, Long> needSupplies;
    
    @EmbedMap
    Map<Key<Supply>, Long> haveSupplies;
    
    @EmbedMap
    Map<Key<Supply>, Long> usedSupplies;
    
    List<Key<Job>> jobs;
    
    public enum DisasterType{
        NATURAL, ACCIDENT
    }

    public long getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(long issueDate) {
        this.issueDate = issueDate;
    }

    public String getGeoX() {
        return geoX;
    }

    public void setGeoX(String geoX) {
        this.geoX = geoX;
    }

    public String getGeoY() {
        return geoY;
    }

    public void setGeoY(String geoY) {
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


    public Key<User> getOwner() {
        return owner;
    }

    public void setOwner(Key<User> owner) {
        this.owner = owner;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public List<Key<Job>> getJobs() {
        return jobs;
    }

    public void setJobs(List<Key<Job>> jobs) {
        this.jobs = jobs;
    }

}
