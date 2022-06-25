package dennnoval.springebankingrest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Account implements Serializable {

  @Id
  @GeneratedValue
  private int id;
  @Column(name = "registered_at", columnDefinition = "TIMESTAMP")
  @Temporal(TemporalType.TIMESTAMP)
  private final Date registeredAt = new Date();
  private int balance;
  private String status;
  @OneToOne(fetch = FetchType.LAZY)
  private Customer customer;

  public Account(int balance, String status, Customer customer) {
    this.balance = balance;
    this.status = status;
    this.customer = customer;
  }

}
