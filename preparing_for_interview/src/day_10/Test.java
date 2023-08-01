package day_10;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

class Test {
	
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        
        String json = "{\"name\":\"John\",\"age\":31,\"city\":\"London\"}";
        Person1 person = objectMapper.readValue(json, Person1.class);
        System.out.println("Person object: " + person);
    }
}