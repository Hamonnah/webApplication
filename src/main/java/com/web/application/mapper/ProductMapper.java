package com.web.application.mapper;

import com.web.application.domain.Product;
import com.web.application.dto.ProductDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {

    public Product mapToProduct(final ProductDto productDto) {
        return new Product(productDto.getProductName());
    }

    public ProductDto mapToProductDto(final Product product) {
        return new ProductDto(product.getProductName());
    }

    public List<ProductDto> mapToProductDtoList(final List<Product> productList) {
        return productList.stream()
                .map(l -> new ProductDto( l.getProductName()))
                .collect(Collectors.toList());
    }

    public List<Product> mapToProductList(final List<ProductDto> productList ){
        return productList.stream()
                .map(l -> new Product(l.getProductName()))
                .collect(Collectors.toList());
    }

}
