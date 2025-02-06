package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Read JSON file and convert to POJO
            RegPayload regPayload = objectMapper.readValue(new File("Reg-Payload.json"), RegPayload.class);

            // Print some fields to verify
            System.out.println("Action: " + regPayload.getAction());
            System.out.println("First Name: " + regPayload.getPayload().getFirstName());
            System.out.println("Email: " + regPayload.getPayload().getEmailAddress());

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}