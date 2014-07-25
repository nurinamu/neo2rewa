package com.veckon.hack.neo2rewa.datastore;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;

@Entity
public class VolunteerLog extends EntityData{

    Key<Disaster> disaster;
    Key<User> user;
    long enterDate;
    long quitDate;
}
