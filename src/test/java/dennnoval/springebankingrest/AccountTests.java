package dennnoval.springebankingrest;

import dennnoval.springebankingrest.repository.UserRepo;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AccountTests {

  @Autowired
  private UserRepo userRepo;

  /*@Test
  void getUserById_Test() {
    userRepo.findById(1);
  }*/

}
