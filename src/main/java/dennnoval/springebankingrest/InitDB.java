package dennnoval.springebankingrest;

import dennnoval.springebankingrest.entity.Account;
import dennnoval.springebankingrest.entity.Customer;
import dennnoval.springebankingrest.entity.Transaction;
import dennnoval.springebankingrest.entity.Users;
import dennnoval.springebankingrest.repository.AccountRepo;
import dennnoval.springebankingrest.repository.CustomerRepo;
import dennnoval.springebankingrest.repository.TransactionRepo;
import dennnoval.springebankingrest.repository.UserRepo;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Log4j2
//@Configuration
public class InitDB {

  //@Bean
  CommandLineRunner initDatabase(CustomerRepo repo1, AccountRepo repo2, UserRepo repo3, TransactionRepo repo4) {
    return args -> {
      log.info("Database Initialization...");
      Customer customer = new Customer("Jane Doe", "1991-01-01", "Beverly Hills St.", "55349271", "jane@email.com");
      Account account = new Account(0, "active", customer);
      Users user = new Users("123456", LocalDateTime.now(), account);
      repo1.save(customer);
      repo2.save(account);
      repo3.save(user);
      account.setBalance(100);
      repo2.save(account);
      Transaction transaction = new Transaction("DP", account.getBalance(), account);
      repo4.save(transaction);
      log.info("Finish.");
    };
  }

}
