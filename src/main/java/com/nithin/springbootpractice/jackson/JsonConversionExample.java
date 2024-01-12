package com.nithin.springbootpractice.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConversionExample {
	
	   public static void main(String[] args) {
	        // Your JSON string
	        String jsonString = "[\n" +
	                "   {\n" +
	                "       \"proMember\": true,\n" +
	                "       \"programs\": [ { \"programName\": \"ProgramA\", \"count\": 2 }, { \"programName\": \"ProgramB\", \"count\": 1 } ],\n" +
	                "       \"coupons\": [ \"DealG5\", \"DealG20\" ]\n" +
	                "   },\n" +
	                "   {\n" +
	                "       \"proMember\": false,\n" +
	                "       \"programs\": [ { \"programName\": \"ProgramC\", \"count\": 3 }, { \"programName\": \"ProgramD\", \"count\": 1 } ],\n" +
	                "       \"coupons\": [ \"DealG10\" ]\n" +
	                "   }\n" +
	                "]";

	        try {
	            ObjectMapper objectMapper = new ObjectMapper();
	            RequestModel[] requestModels = objectMapper.readValue(jsonString, RequestModel[].class);

	            // Print the converted Java objects
	            for (RequestModel requestModel : requestModels) {
	                System.out.println(requestModel);
	            }

	            // Convert Java objects back to JSON
	            String convertedJson = objectMapper.writeValueAsString(requestModels);
	            System.out.println("Converted JSON:\n" + convertedJson);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
