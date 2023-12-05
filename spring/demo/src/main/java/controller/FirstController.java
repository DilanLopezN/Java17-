package controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-controller")
public class FirstController {
  
  @GetMapping("/first-method/{id}")
  public String firstMethod(@PathVariable String id){
    return "First rest method " + id;
  }

  @GetMapping("/query-methods")
  public String queryMethod(@RequestParam String id){ 
      return "Query method" + id;
  }

    @GetMapping("/query-methods/mapped")
  public String queryMethodMapped(@RequestParam Map<String, String> allParams){ 
      return "Query method" + allParams.entrySet();
  }

  @PostMapping("/header-methods/mapped")
  public String header(@RequestHeader Map<String, String> allParams){ 
      return "Header method" + allParams.entrySet();
  }

  @GetMapping("/response-entity")
  public ResponseEntity<Object> responseEntity() {
    return ResponseEntity.status(409).body("Error message");
  }
}
