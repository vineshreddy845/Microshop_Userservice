package Microshop.MicroShop.controller;

import Microshop.MicroShop.respository.Repository;
import Microshop.MicroShop.userservice.Userservice;
import jakarta.transaction.Transactional;
import org.hibernate.sql.Delete;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class Controller {
   // private static final Logger logger = LoggerFactory.getLogger(Controller.class);
    @Autowired
    private Repository repo;
    @GetMapping("/Registration")
    public String Registration(@RequestBody Userservice userservice)
    {
//        logger.debug("Received registration request: {}", userservice);
//
//        logger.debug("Username: {}", userservice.getUsername());
//        logger.debug("Password: {}", userservice.getPassword());
//        logger.debug("Email: {}", userservice.getEmail());
//        logger.debug("First Name: {}", userservice.getFirst_Name());
//        logger.debug("Last Name: {}", userservice.getLast_Name());
//        logger.debug("Address: {}", userservice.getAddress());
//        logger.debug("Role: {}", userservice.getRole());

        repo.save(userservice);
      //  logger.info("User saved successfully");
        return "sucessfull";
    }


//    @Transactional:
//    Purpose: The @Transactional annotation is used to mark a method, class, or interface as transactional. It indicates that a transaction boundary should be established around the annotated method.
//    Usage: You can place @Transactional on a method or class. When placed on a class, it applies to all public methods of that class.
//    Effects: When a method annotated with @Transactional is called, a transaction is initiated before the method is executed. If the method completes successfully, the transaction is committed.
//    If an exception occurs, the transaction is rolled back.

    @Transactional
    @GetMapping("/vinesh")
    public Userservice name(@RequestBody Userservice userservice)
    {

        return  repo.Name1(userservice.getFirst_Name());
    }
    }

