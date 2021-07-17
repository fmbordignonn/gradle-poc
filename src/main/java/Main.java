import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");

    ObjectMapper objectMapper = new ObjectMapper();

    Person person = new Person("Felipe", 22);

    try {
      System.out.println("Printando json: " + objectMapper.writeValueAsString(person));
    } catch (JsonProcessingException ex) {
      System.out.println("Erro ao usar ObjectMapper: " + ex.getMessage());
    }
  }
}
