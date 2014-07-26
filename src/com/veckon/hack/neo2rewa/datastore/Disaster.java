package com.veckon.hack.neo2rewa.datastore;

import java.util.List;
import java.util.Map;

import com.google.appengine.api.datastore.Text;
import com.googlecode.objectify.annotation.EmbedMap;
import com.googlecode.objectify.annotation.Entity;


@Entity
public class Disaster extends EntityData{
    
    long issueDate;
    String geoX;
    String geoY;
    Text description;
    DisasterType type;

    String owner;
    String area;
    
    @EmbedMap
    Map<String, Long> needSupplies;
    
    @EmbedMap
    Map<String, Long> haveSupplies;
    
    @EmbedMap
    Map<String, Long> usedSupplies;
    
    List<String> jobIDs;
    
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

    public Map<String, Long> getNeedSupplies() {
        return needSupplies;
    }

    public void setNeedSupplies(Map<String, Long> needSupplies) {
        this.needSupplies = needSupplies;
    }

    public Map<String, Long> getHaveSupplies() {
        return haveSupplies;
    }

    public void setHaveSupplies(Map<String, Long> haveSupplies) {
        this.haveSupplies = haveSupplies;
    }

    public Map<String, Long> getUsedSupplies() {
        return usedSupplies;
    }

    public void setUsedSupplies(Map<String, Long> usedSupplies) {
        this.usedSupplies = usedSupplies;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

   public List<String> getJobs() {
        return jobIDs;
    }

    public void setJobs(List<String> jobs) {
        this.jobIDs = jobs;
    }

}
