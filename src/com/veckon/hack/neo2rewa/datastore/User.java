package com.veckon.hack.neo2rewa.datastore;


public class User extends EntityData{
    
    String name;
    String phone;
    String email;
    String password;
    Permission permission;
    
    public enum Permission{
        ADMIN,USER
    }
    
}
