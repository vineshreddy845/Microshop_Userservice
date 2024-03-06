package Microshop.MicroShop.respository;

import Microshop.MicroShop.userservice.Userservice;
import org.springframework.data.jpa.repository.JpaRepository;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Userservice,Long>{

}

