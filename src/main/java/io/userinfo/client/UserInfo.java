package io.userinfo.client;

import io.userinfo.client.model.Info;

public class UserInfo {
    public static Info getInfo(String ipAddress) {
        System.out.println("Hello World!");
        return new Info();
    }
}
