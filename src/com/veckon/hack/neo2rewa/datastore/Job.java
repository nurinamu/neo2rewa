package com.veckon.hack.neo2rewa.datastore;

import com.google.appengine.api.datastore.Text;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;

@Entity
public class Job extends EntityData{
    
   Text desc;
   
   @Index
   String type;

   long needs;
   long have;
   long quit;
   
public Text getDesc() {
	return desc;
}
public void setDesc(Text desc) {
	this.desc = desc;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public long getNeeds() {
	return needs;
}
public void setNeeds(long needs) {
	this.needs = needs;
}
public long getHave() {
	return have;
}
public void setHave(long have) {
	this.have = have;
}
public long getQuit() {
	return quit;
}
public void setQuit(long quit) {
	this.quit = quit;
}
   
   
}
