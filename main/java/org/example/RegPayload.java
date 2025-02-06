package org.example;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class RegPayload {
    private String action;
    private Payload payload;

    // Getters and Setters
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }
}