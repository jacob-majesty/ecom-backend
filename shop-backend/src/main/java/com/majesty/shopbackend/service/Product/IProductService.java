package com.majesty.shopbackend.service.Product;

import java.util.List;
import com.majesty.shopbackend.model.Product;

public interface IProductService {

    Product addProduct(Product product);

    Product getProductById(Long id);

    void deleteProductById(Long id);

    Product updateProduct(Product product, Long productId);

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    List<Product> getProductsByBrand(String brand);

    List<Product> getProductsByCategoryAndBrand(String category, String brand);

    List<Product> getProductsByName(String name);

    List<Product> getProductsByBrandAndName(String category, String name);

    Long countProductsByBrandAndName(String brand, String name);

    List<Product> getConvertedProducts(List<Product> products);

}
