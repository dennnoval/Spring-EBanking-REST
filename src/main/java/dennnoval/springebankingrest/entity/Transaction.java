package dennnoval.springebankingrest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaction implements Serializable {

  @Id
  @GeneratedValue
  private int id;
  @Column(name = "date_time", columnDefinition = "TIMESTAMP")
  private final LocalDateTime dateTime = LocalDateTime.now();
  @Column(length = 30)
  private String type;
  private int amount;
  private String note;
  @ManyToOne(fetch = FetchType.LAZY)
  @JsonIgnore
  private Account account;

  public Transaction(String type, int amount, Account account) {
    this.type = type;
    this.amount = amount;
    this.account = account;
  }

  public Transaction(String type, int amount, String note, Account account) {
    this.type = type;
    this.amount = amount;
    this.note = note;
    this.account = account;
  }

}
