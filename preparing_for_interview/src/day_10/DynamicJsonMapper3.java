package day_10;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class DynamicJsonMapper3{
  public static void main(String[] args) throws Exception {
    String json = "{\"name\": \"John\", \"age\": 30, \"city\": \"New York\", \"address\": {\"street\": \"123 Main St\", \"zip\": \"10001\"}}";

    ObjectMapper mapper = new ObjectMapper();
    Person person = mapper.readValue(json, Person.class);

    System.out.println(person.getName());
    System.out.println(person.getAge());
    System.out.println(person.getCity());
    System.out.println(person.getAddress());
  }

  public static class Person {
    private String name;
    private int age;
    private String city;
    private Map<String, Object> additionalProperties = new HashMap<>();

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public String getCity() {
      return city;
    }

    public void setCity(String city) {
      this.city = city;
    }

    public Map<String, Object> getAdditionalProperties() {
      return additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String key, Object value) {
      additionalProperties.put(key, value);
    }

    public String getAddress() {
      Map<String, String> address = (Map<String, String>) additionalProperties.get("address");
      String street = address.get("street");
      String zip = address.get("zip");
      return street + ", " + zip;
    }
  }
}