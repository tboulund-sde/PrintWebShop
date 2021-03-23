package dk.easv.products;

public class Shirt extends Product {

    protected Shirt(String text, String font) {
        super(text, font);
    }

    @Override
    public double getPrice() {
        return 200;
    }
}
