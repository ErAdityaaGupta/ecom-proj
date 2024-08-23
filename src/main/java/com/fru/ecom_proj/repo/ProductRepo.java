package com.fru.ecom_proj.repo;

import com.fru.ecom_proj.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    // this kind of methods could be written for all types on which we want to search in the website.
//    public List<Product> findByBrand(String Brand);

    // This kind of thing could also be done with the help of JPQL  (Java Persistence Quarry Language)
}
