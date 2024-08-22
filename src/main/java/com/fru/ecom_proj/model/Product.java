package com.fru.ecom_proj.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String name;
    private String desc;
    private String brand;
    private BigDecimal  price;
    private String category;
    private boolean available;
    private int quantity;

//    @JsonFormat(shape = JsonFormat.Shape.STRING ,pattern = "dd-MM-yyyy ")
    private Date  date;

    private String imageName;
    private String imageType;

    @Lob
    private byte[] imageData;

}
