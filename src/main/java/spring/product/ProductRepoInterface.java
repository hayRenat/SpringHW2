package spring.product;

import java.util.List;

public interface ProductRepoInterface {

    List<Product> getProductList();

    public Product getProduct(int index);
}
