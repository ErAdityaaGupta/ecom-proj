package com.fru.ecom_proj.controller;

import com.fru.ecom_proj.model.Product;
import com.fru.ecom_proj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String greet(){
        return "Hello Aditya";
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/products/{id}")
    public ResponseEntity< Product> getProduct(@PathVariable int id){

        Product product = service.getProductById(id);

        if(product != null){
            return new ResponseEntity<>(product,HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

//        return new ResponseEntity<>(service.getProductById(id),HttpStatus.OK);
    }

    @PostMapping("/products")
    public ResponseEntity<?> addProduct(@RequestPart Product product,
                                        @RequestPart MultipartFile imageFile) {
        try {
            Product product1 = service.addProduct(product, imageFile);
            return new ResponseEntity<>(product1,HttpStatus.CREATED);
        } catch (Exception e) {
             return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
