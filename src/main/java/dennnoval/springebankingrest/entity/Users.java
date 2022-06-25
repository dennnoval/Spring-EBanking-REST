package dennnoval.springebankingrest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users implements Serializable {

  @Id
  @GeneratedValue
  private int id;
  @Column(length = 6)
  private String pin;
  @Column(name = "last_active", columnDefinition = "TIMESTAMP")
  private LocalDateTime lastActive;
  @OneToOne
  private Account account;

  public Users(String pin, LocalDateTime lastActive, Account account) {
    this.pin = pin;
    this.lastActive = lastActive;
    this.account = account;
  }

}
