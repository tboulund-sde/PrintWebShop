package dk.easv;

import dk.easv.products.*;
import dk.easv.ui.Shop;

public class Customer {

    public static void main(String[] args) {
		ProductFactory factory = new ProductFactory();
	    Shop shop = new Shop();

	    Product[] products = new Product[] {
			factory.createProduct(ProductFactory.ProductType.Poster, "Hello World", "Comic Sans")
        };

	    shop.placeOrder(products);
    }
}
