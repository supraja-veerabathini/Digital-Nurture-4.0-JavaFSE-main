package org.example;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void send(String msg) {
        api.sendData(msg);
    }
}
