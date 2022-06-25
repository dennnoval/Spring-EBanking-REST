package dennnoval.springebankingrest.service;

import dennnoval.springebankingrest.entity.Account;
import dennnoval.springebankingrest.entity.Transaction;
import dennnoval.springebankingrest.repository.AccountRepo;
import dennnoval.springebankingrest.repository.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountService implements AccountServiceInterface {

  @Autowired
  private AccountRepo accountRepo;

  @Autowired
  private TransactionRepo transactionRepo;

  private Account account;

  public void setAccount(Integer accountId) {
    this.account = accountRepo.findById(accountId).get();
  }

  @Override
  public int checkBalance() {
    return account.getBalance();
  }

  @Override
  public List<Transaction> checkTransactionHistory() {
    return transactionRepo.findAllByAccountId(account.getId());
  }

  @Override
  @Transactional
  public void deposit(int amount) {
    account.setBalance(account.getBalance() + amount);
    transactionRepo.save(new Transaction("DP", amount, account));
  }

  @Override
  @Transactional
  public void withdraw(int amount) {
    if (account.getBalance() < amount) return;
    account.setBalance(account.getBalance() - amount);
    transactionRepo.save(new Transaction("WD", amount, account));
  }

  @Override
  @Transactional
  public void transfer(String to, int amount) {
    String note = String.format("To : %s", to);
    transactionRepo.save(new Transaction("TF", amount, note, account));
    account.setBalance(account.getBalance() - amount);
  }

}
