package Microshop.MicroShop.respository;

import Microshop.MicroShop.userservice.Userservice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Userservice,Long>{


     // @Modifying
//    @Query("DELETE FROM Userservice u WHERE u.user_ID = :user_ID")
//    void deleteByUser_ID(Long user_ID);
//    @Modifying
//    @Query(value="DELETE FROM Userservice u WHERE u. First_Name =:NULL",nativeQuery = true)
//    void Firtname();

    @Query("SELECT u FROM Userservice u WHERE u. First_Name = :firstname ")
    Userservice Name1(String firstname);
}
//Purpose: The @Modifying annotation is used in conjunction with the @Query annotation in Spring Data JPA to indicate that a query is intended to modify data in the database (e.g., INSERT, UPDATE, DELETE).
//        Usage: Place @Modifying on a method that uses the @Query annotation for a modification query.
//        Effects: When using @Modifying, you're telling Spring Data JPA that the query modifies the database, so it should be treated as such.
//        It ensures that the query is executed within a transaction and is subject to transactional behavior.
