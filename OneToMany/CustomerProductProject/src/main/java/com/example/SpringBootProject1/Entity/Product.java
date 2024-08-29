package com.example.SpringBootProject1.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Getter
@Setter
public class Product {
    @Id
    private int pid;
    private String productname;
    private int qty;
    private int price;
}
