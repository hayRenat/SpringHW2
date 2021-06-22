package spring.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepoInterface productRepoInterface;

    @Autowired
    ProductRepo productRepo;

    public ProductService(ProductRepoInterface productRepoInterface) {
        this.productRepoInterface = productRepoInterface;
    }

    public int getProductCount(){
        return productRepoInterface.getProductList().size();
    }

    public float getAveragePrice(){
        if (getProductCount() == 0){
            return 0;
        }
        int avg = 0;
        for (Product product: productRepoInterface.getProductList()){
            avg += product.getCost();
        }
        return avg /= getProductCount();
    }
}
