package com.veckon.hack.neo2rewa.datastore;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;

@Entity
public class VolunteerLog extends EntityData{

    Key<Disaster> disaster;
    Key<User> user;
    long enterDate;
    long quitDate;
    public Key<Disaster> getDisaster() {
        return disaster;
    }
    public void setDisaster(Key<Disaster> disaster) {
        this.disaster = disaster;
    }
    public Key<User> getUser() {
        return user;
    }
    public void setUser(Key<User> user) {
        this.user = user;
    }
    public long getEnterDate() {
        return enterDate;
    }
    public void setEnterDate(long enterDate) {
        this.enterDate = enterDate;
    }
    public long getQuitDate() {
        return quitDate;
    }
    public void setQuitDate(long quitDate) {
        this.quitDate = quitDate;
    }
}
