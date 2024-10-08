package com.iod.ProductService.service;

import com.iod.ProductService.model.ProductRequest;
import com.iod.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
