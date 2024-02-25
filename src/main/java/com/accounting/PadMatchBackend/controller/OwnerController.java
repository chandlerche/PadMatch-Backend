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

    @PutMapping("/owners/{id}")
    Owner updateOwner(@RequestBody Owner newOwner, @PathVariable int id) {
        return ownerRepository.findById(id).map(owner -> {
            owner.setAddress(newOwner.getAddress());
            owner.setOwner_name(newOwner.getOwner_name());
            owner.setAlternate_phone(newOwner.getAlternate_phone());
            owner.setCheck_memo(newOwner.getCheck_memo());
            owner.setCity(newOwner.getCity());
            owner.setDraw_account(newOwner.getDraw_account());
            owner.setEmail(newOwner.getEmail());
            owner.setManager_id(newOwner.getManager_id());
            owner.setMonthly_report(newOwner.getMonthly_report());
            owner.setNotes(newOwner.getNotes());
            owner.setPayment_method(newOwner.getPayment_method());
            owner.setPhone(newOwner.getPhone());
            owner.setReceives_1099(newOwner.getReceives_1099());
            owner.setState(newOwner.getState());
            owner.setZipcode(newOwner.getZipcode());
            owner.setNumbers_of_properties(newOwner.getNumbers_of_properties());
            owner.setNumbers_of_units(newOwner.getNumbers_of_units());
            return ownerRepository.save(owner);
        }).orElseThrow(()->new OwnerNotFoundException(id));
    }

    @DeleteMapping("/owners/{id}")
    String deleteOwner(@PathVariable int id) {
        if(!ownerRepository.existsById(id)) {
            throw new OwnerNotFoundException(id);
        }
        ownerRepository.deleteById(id);
        return "Owner with id " + id + " has been deleted successfully.";
    }

}
