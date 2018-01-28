package com.ridvan.ab2018.courseday1.controller;

import com.ridvan.ab2018.courseday1.Repository.ContactRepository;
import com.ridvan.ab2018.courseday1.model.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ContactController {

    @Autowired
    ContactRepository contactRepository;

    @GetMapping(value = "contacts")
    public Iterable<Contract> index() {
        Iterable<Contract> contacs = contactRepository.findAll();
        return contacs;
    }
}
