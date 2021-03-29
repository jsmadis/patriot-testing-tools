package com.example.restservice;

public class CoapConfiguration {
    private String hostname;
    private String path;

    public CoapConfiguration(String hostname, String path) {
        this.hostname = hostname;
        this.path = path;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
