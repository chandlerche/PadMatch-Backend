package com.accounting.PadMatchBackend.controller;

import com.accounting.PadMatchBackend.exception.OwnerNotFoundException;
import com.accounting.PadMatchBackend.model.Owner;
import com.accounting.PadMatchBackend.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000") // this helps connect frontend and backend
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

    @GetMapping("/owners/{id}")
    Owner getOwnerById(@PathVariable int id) {
        return ownerRepository.findById(id).orElseThrow(()->new OwnerNotFoundException(id));
    }

}
