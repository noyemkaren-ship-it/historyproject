package com.example.pog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.pog.models.InfoData;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class RestControllers {

     private final ObjectMapper mapper = new ObjectMapper();

     @GetMapping("/data/{data}")
     public String data(@PathVariable int data) {
          String result = Chek.check(data);
          return result;
     }

     @GetMapping("/add/{name}/{text}/{img}/{dates}")
     public String add(@PathVariable String name,
               @PathVariable String text,
               @PathVariable String img,
               @PathVariable String dates) {
          try {
               InfoData data = new InfoData(name, text, img, dates);
               String jsonString = mapper.writeValueAsString(data);
               return jsonString;
          } catch (JsonProcessingException e) {
               return "{\"error\": \"Failed to process JSON\"}";
          }
     }
}