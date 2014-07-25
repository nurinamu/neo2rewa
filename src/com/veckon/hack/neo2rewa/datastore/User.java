package com.veckon.hack.neo2rewa.datastore;

import com.googlecode.objectify.annotation.Entity;

@Entity
public class User extends EntityData{
    
    String name;
    String phone;
    String email;
    String password;
    Permission permission;
   
	public enum Permission{
        ADMIN,USER
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
    
}
