package com.pharma.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharma.models.Stock;
@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {
}
