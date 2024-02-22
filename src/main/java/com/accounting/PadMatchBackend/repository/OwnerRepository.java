package com.accounting.PadMatchBackend.repository;

import com.accounting.PadMatchBackend.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {
}
