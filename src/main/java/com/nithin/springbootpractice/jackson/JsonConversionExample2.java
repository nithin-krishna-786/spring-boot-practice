package com.nithin.springbootpractice.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConversionExample2 {
    public static void main(String[] args) {
        // Your JSON string
        String jsonString = "[\n" +
                "   {\n" +
                "       \"id\": \"0001\",\n" +
                "       \"type\": \"Cake\",\n" +
                "       \"name\": \"donut\",\n" +
                "       \"ppu\": 0.55,\n" +
                "       \"batters\":\n" +
                "           {\n" +
                "               \"batter\":\n" +
                "                   [\n" +
                "                       { \"id\": \"1001\", \"type\": \"Regular\" },\n" +
                "                       { \"id\": \"1002\", \"type\": \"Chocolate\" },\n" +
                "                       { \"id\": \"1003\", \"type\": \"Blueberry\" },\n" +
                "                       { \"id\": \"1004\", \"type\": \"Devil's Food\" }\n" +
                "                   ]\n" +
                "           },\n" +
                "       \"topping\":\n" +
                "           [\n" +
                "               { \"id\": \"5001\", \"type\": \"None\" },\n" +
                "               { \"id\": \"5002\", \"type\": \"Glazed\" },\n" +
                "               { \"id\": \"5005\", \"type\": \"Sugar\" },\n" +
                "               { \"id\": \"5007\", \"type\": \"Powdered Sugar\" },\n" +
                "               { \"id\": \"5006\", \"type\": \"Chocolate with Sprinkles\" },\n" +
                "               { \"id\": \"5003\", \"type\": \"Chocolate\" },\n" +
                "               { \"id\": \"5004\", \"type\": \"Maple\" }\n" +
                "           ]\n" +
                "   },\n" +
                "   {\n" +
                "       \"id\": \"0002\",\n" +
                "       \"type\": \"donut\",\n" +
                "       \"name\": \"Cake\",\n" +
                "       \"ppu\": 0.55,\n" +
                "       \"batters\":\n" +
                "           {\n" +
                "               \"batter\":\n" +
                "                   [\n" +
                "                       { \"id\": \"1001\", \"type\": \"Regular\" },\n" +
                "                       { \"id\": \"1002\", \"type\": \"Chocolate\" },\n" +
                "                       { \"id\": \"1003\", \"type\": \"Blueberry\" },\n" +
                "                       { \"id\": \"1004\", \"type\": \"Devil's Food\" }\n" +
                "                   ]\n" +
                "           },\n" +
                "       \"topping\":\n" +
                "           [\n" +
                "               { \"id\": \"5001\", \"type\": \"None\" },\n" +
                "               { \"id\": \"5002\", \"type\": \"Glazed\" },\n" +
                "               { \"id\": \"5005\", \"type\": \"Sugar\" },\n" +
                "               { \"id\": \"5007\", \"type\": \"Powdered Sugar\" },\n" +
                "               { \"id\": \"5006\", \"type\": \"Chocolate with Sprinkles\" },\n" +
                "               { \"id\": \"5003\", \"type\": \"Chocolate\" },\n" +
                "               { \"id\": \"5004\", \"type\": \"Maple\" }\n" +
                "           ]\n" +
                "   }\n" +
                "]";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Item[] items = objectMapper.readValue(jsonString, Item[].class);

            // Print the converted Java objects
            for (Item item : items) {
                System.out.println(item);
            }

            // Convert Java objects back to JSON
            String convertedJson = objectMapper.writeValueAsString(items);
            System.out.println("Converted JSON:\n" + convertedJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
