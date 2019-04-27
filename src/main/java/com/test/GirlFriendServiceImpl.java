package com.test;

import org.springframework.beans.factory.annotation.Autowired;

public class GirlFriendServiceImpl implements GirlFriendServiceInterface{
    @Autowired
    private GirlFriendProperties girlFriendProperties;
    @Override
    public void say() {
        System.out.println("调用到了service"+girlFriendProperties.getMessage());
    }
}
