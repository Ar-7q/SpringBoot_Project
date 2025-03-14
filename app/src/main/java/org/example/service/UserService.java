package org.example.service;

import org.apache.catalina.startup.UserConfig;

public class UserService {

    UserConfig userConfig;
    public UserService(UserConfig userConfig){
        this.userConfig=userConfig;
    }
}