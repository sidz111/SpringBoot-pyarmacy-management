package com.pharma.services;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.pharma.models.Stock;
import com.pharma.repository.StockRepository;
@Service
public class StockService {
	// Assume you have methods to fetch data from your database
    // For demonstration purposes, let's return mock data
	private final StockRepository stockRepository;
    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }
    public int getTotalStocks() {
        // Example: Fetch the total count of stocks from the database
        return (int) stockRepository.count();
    }
    

    public int getExpiredDrugs() {
        LocalDate currentDate = LocalDate.now();
        List<Stock> allStocks = stockRepository.findAll();
        int expiredCount = 0;
        
        for (Stock stock : allStocks) {
            LocalDate expiryDate = LocalDate.parse(stock.getExpiredDate());
            if (expiryDate.isBefore(currentDate)) {
                expiredCount++;
            }
        }
        return expiredCount;
    }
    public int getOutOfStockDrugs() {
        List<Stock> allStocks = stockRepository.findAll();
        int outOfStockCount = 0;
        
        for (Stock stock : allStocks) {
            if (stock.getQuantity() == 0) {
                outOfStockCount++;
            }
        }
        return outOfStockCount;
    }
    
    public Map<String, Long> getDrugCategoryDistribution() {
        return stockRepository.findAll().stream()
                .collect(Collectors.groupingBy(Stock::getDrugCategory, Collectors.counting()));
    }

    public Map<String, Long> getTopManufacturers() {
        return stockRepository.findAll().stream()
                .collect(Collectors.groupingBy(Stock::getManufacturer, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(5)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }    

    public double getAverageStockQuantity() {
        List<Integer> stockQuantities = stockRepository.findAll().stream()
                .map(Stock::getQuantity)
                .collect(Collectors.toList());
        return stockQuantities.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public int getMinStockQuantity() {
        List<Integer> stockQuantities = stockRepository.findAll().stream()
                .map(Stock::getQuantity)
                .collect(Collectors.toList());
        return stockQuantities.stream().mapToInt(Integer::intValue).min().orElse(0);
    }

    public int getMaxStockQuantity() {
        List<Integer> stockQuantities = stockRepository.findAll().stream()
                .map(Stock::getQuantity)
                .collect(Collectors.toList());
        return stockQuantities.stream().mapToInt(Integer::intValue).max().orElse(0);
    }

    public double getAveragePrice() {
        List<Integer> prices = stockRepository.findAll().stream()
                .map(Stock::getPrice)
                .collect(Collectors.toList());
        return prices.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public int getMinPrice() {
        List<Integer> prices = stockRepository.findAll().stream()
                .map(Stock::getPrice)
                .collect(Collectors.toList());
        return prices.stream().mapToInt(Integer::intValue).min().orElse(0);
    }

    public int getMaxPrice() {
        List<Integer> prices = stockRepository.findAll().stream()
                .map(Stock::getPrice)
                .collect(Collectors.toList());
        return prices.stream().mapToInt(Integer::intValue).max().orElse(0);
    }
    
    public List<Stock> filterStocksByDrugName(String keyword) {
    	List<Stock> allStock = stockRepository.findAll();
        return allStock.stream()
            .filter(stock -> stock.getDrugName().toLowerCase().contains(keyword.toLowerCase()))
            .collect(Collectors.toList());
    }
}
