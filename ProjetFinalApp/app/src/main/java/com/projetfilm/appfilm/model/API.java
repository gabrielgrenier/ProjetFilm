package com.projetfilm.appfilm.model;

public class API {
    private String name;
    private int port;

    public API(String name, int port) {
        this.name = name;
        this.port = port;
    }

    public API(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
