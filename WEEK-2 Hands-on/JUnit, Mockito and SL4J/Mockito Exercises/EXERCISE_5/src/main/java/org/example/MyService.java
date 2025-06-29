package org.example;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchTwice() {
        return api.getData() + " & " + api.getData();
    }
}
