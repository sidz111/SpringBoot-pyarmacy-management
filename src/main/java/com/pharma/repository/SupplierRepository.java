package com.pharma.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharma.models.Supplier;
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}