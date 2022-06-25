package dennnoval.springebankingrest.service;

import dennnoval.springebankingrest.entity.Transaction;

import java.util.List;

public interface AccountServiceInterface {

  int checkBalance();

  List<Transaction> checkTransactionHistory();

  void deposit(int amount);

  void withdraw(int amount);

  void transfer(String to, int amount);

}
