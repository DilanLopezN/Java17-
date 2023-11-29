package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-controller")
public class FirstController {
  
  @GetMapping("/first-method/{id}")
  public String firstMethod(@PathVariable String id){
    return "First rest method " + id;
  }
}
