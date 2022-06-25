package dennnoval.springebankingrest.controller;

import dennnoval.springebankingrest.entity.Account;
import dennnoval.springebankingrest.entity.Transaction;
import dennnoval.springebankingrest.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/account")
@RestController
public class AccountController {

  @Autowired
  private AccountService accountService;

  @GetMapping("/balance")
  public ResponseEntity<Object> balance() {
    accountService.setAccount(2);
    int balance = accountService.checkBalance();
    return ResponseEntity.status(200)
      .body("{ \"balance\" : "+ balance  +" }");
  }

  @GetMapping("/history")
  public ResponseEntity<Object> history() {
    accountService.setAccount(2);
    List<Transaction> txList = accountService.checkTransactionHistory();
    Map<String, Object> res = new HashMap<>();
    res.put("transactionHistory", (Object) txList);
    return ResponseEntity.ok().body(res);
  }

  @PostMapping("/deposit")
  public ResponseEntity<Object> deposit(@RequestBody Map<String, Object> json) {
    accountService.setAccount(2);
    int amount = (int) json.get("amount");
    accountService.deposit(amount);
    return ResponseEntity.status(202).build();
  }

  @PostMapping("/withdraw")
  public ResponseEntity<Object> withdraw(@RequestBody Map<String, Object> json) {
    accountService.setAccount(2);
    int amount = (int) json.get("amount");
    accountService.withdraw(amount);
    return ResponseEntity.status(200).build();
  }

  @PostMapping("/transfer")
  public ResponseEntity<Object> transfer(@RequestBody Map<String, Object> json) {
    accountService.setAccount(2);
    // String to = "4435268991236480";
    String to = String.valueOf(json.get("to"));
    int amount = (int) json.get("amount");
    accountService.transfer(to, amount);
    return ResponseEntity.status(200).build();
  }

}
