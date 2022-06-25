package dennnoval.springebankingrest.controller;

import dennnoval.springebankingrest.entity.Customer;
import dennnoval.springebankingrest.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/customer")
public class CustomerController {

  @Autowired
  private CustomerRepo customerRepo;

  @GetMapping("/list")
  public ResponseEntity<Object> list() {
    List<Customer> custList = new ArrayList<>();
    customerRepo.findAll().forEach(customer -> custList.add(customer));
    Map<String, Object> res = new HashMap<>();
    res.put("customers", (Object) custList);
    return ResponseEntity.status(200).body(res);
  }

}
