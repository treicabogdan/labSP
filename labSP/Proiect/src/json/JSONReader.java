
package json;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import patterns.model.Book;

public class JSONReader {
  @SuppressWarnings({ "unused", "unchecked" })
public static void main(final String[] args) throws JsonParseException, JsonMappingException, IOException {
    Book book = new Book("Carte 1");

    final ObjectMapper mapper = new ObjectMapper();
    final HashMap<String, Object> readValue = mapper.readValue(new File("book.json"), HashMap.class);
    for (Object value : readValue.values()) {
      System.out.println("value = " + value);
    }
    System.out.println("read value = " + readValue); 
  }
}
