package Microshop.MicroShop.controller;

import Microshop.MicroShop.respository.Repository;
import Microshop.MicroShop.userservice.Userservice;
import org.hibernate.sql.Delete;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);
    @Autowired
    private Repository repo;
    @GetMapping("/Registration")
    public String Registration(@RequestBody Userservice userservice)
    {
        logger.debug("Received registration request: {}", userservice);

        logger.debug("Username: {}", userservice.getUsername());
        logger.debug("Password: {}", userservice.getPassword());
        logger.debug("Email: {}", userservice.getEmail());
        logger.debug("First Name: {}", userservice.getFirst_Name());
        logger.debug("Last Name: {}", userservice.getLast_Name());
        logger.debug("Address: {}", userservice.getAddress());
        logger.debug("Role: {}", userservice.getRole());

        repo.save(userservice);
        logger.info("User saved successfully");
        return "sucessfull";
    }

    @GetMapping("/delete")
    public String detelete()
    {
        repo.deleteAll();
        return "deleted";
    }
}
