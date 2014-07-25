package com.veckon.hack.neo2rewa.datastore;

import com.google.appengine.api.datastore.Text;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Parent;

@Entity
public class Job extends EntityData{
    
   @Parent
   Key<Disaster> parent;
   Text desc;
   String type;

   long needs;
   long have;
   long quit;
}
