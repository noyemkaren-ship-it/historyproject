package com.example.pog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlControllers {

     @GetMapping("/histor")
     public String index() {
          return "index.html";
     }

     @GetMapping("/dato")
     public String dato1() {
          return "dato.html";
     }

     @GetMapping("/galery")
     public String galery() {
          return "galery.html";
     }
}
