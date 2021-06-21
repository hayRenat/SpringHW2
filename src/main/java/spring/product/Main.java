package spring.product;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductService productService = context.getBean("productService", ProductService.class);

        System.out.println("Колличество продуктов в репозитории - " + productService.getProductCount());
        System.out.println("Средняя цена продуктов в репозитории - " + productService.getAveragePrice());

        productService.
    }
}
