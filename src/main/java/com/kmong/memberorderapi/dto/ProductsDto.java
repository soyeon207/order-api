package com.kmong.memberorderapi.dto;

import com.kmong.memberorderapi.enumeration.ProductStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductsDto {
    protected Long id;
    protected String name;
    protected Integer price;
    protected ProductStatus status;
}
