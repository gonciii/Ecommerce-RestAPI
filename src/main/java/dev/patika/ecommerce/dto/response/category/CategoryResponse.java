package dev.patika.ecommerce.dto.response.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CategoryResponse {

    // validation gerek yok
    private int id;
    private String name;
}
