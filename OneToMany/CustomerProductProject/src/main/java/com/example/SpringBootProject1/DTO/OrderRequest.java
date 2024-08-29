package com.example.SpringBootProject1.DTO;

import com.example.SpringBootProject1.Entity.Customer;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class OrderRequest {
    private Customer customer;
}
