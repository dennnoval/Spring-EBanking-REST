package dennnoval.springebankingrest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Customer implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  @Column(name = "full_name", length = 50)
  private String fullName;
  private Date dob;
  @Column(length = 80)
  private String address;
  @Column(length = 14)
  private String phone;
  @Column(length = 20)
  private String email;

  public Customer(String fullName, String dob, String address, String phone, String email) {
    this.fullName = fullName;
    this.dob = Date.valueOf(dob);
    this.address = address;
    this.phone = phone;
    this.email = email;
  }
}
