package kabagambe.demo.entities;


import jakarta.persistence.*;
import lombok.*;

@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private  Long id;

    @Column(name="street")
    private  String street;

    @Column(name="city")
    private String city;
@Column(name="zip")
    private String zip;

@Column(name="state")
private  String state;


}
