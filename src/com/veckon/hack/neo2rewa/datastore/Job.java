package com.veckon.hack.neo2rewa.datastore;

import com.google.appengine.api.datastore.Text;
import com.googlecode.objectify.annotation.Entity;

@Entity
public class Job extends EntityData{
    
   Text desc;
   String type;

   long needs;
   long have;
   long quit;
}
