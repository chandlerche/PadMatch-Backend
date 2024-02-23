package com.accounting.PadMatchBackend.controller;

import com.accounting.PadMatchBackend.model.Owner;
import com.accounting.PadMatchBackend.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OwnerController {

    @Autowired
    private OwnerRepository ownerRepository;

    @PostMapping("/owner")
    Owner newOwner(@RequestBody Owner newOwner) {
        return ownerRepository.save(newOwner);
    }

    @GetMapping("/owners")
    List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

}
