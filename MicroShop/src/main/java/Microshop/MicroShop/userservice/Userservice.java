package Microshop.MicroShop.userservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Userservice")
public class Userservice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_ID;
    @Column(name="username")
    private String Username;
    @Column(name="password")
    private String Password ;//(hashed for security);
    @Column(name="email")
    private String Email;
    @JsonProperty("first_name")
    private String First_Name;
    @JsonProperty("last_name")
    private String Last_Name;
    @Column(name="address")
    private String Address;
    @Column(name="role")
    private String Role;// (e.g., Admin, Customer)
}
//{
//        "username":"vinesh",
//        "password": "vinesh8431",//(hashed for security);
//        "email":"vinesh8431@gmail.com",
//        "first_name":"vineshreddy",
//        "last_name":"jallapuram",
//        "address":"7928 north glen drive",
//        "role":"user"
//        }