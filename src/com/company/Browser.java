package com.company;

public class Browser {
    public void navigate(String address){
        String ip = findIpAddress(address);
    }

    private String findIpAddress(String address) {
        return "127.0.0.0";
    }
}
