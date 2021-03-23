package dk.easv.products;

public class Poster extends Product {

    protected Poster(String text, String font) {
        super(text, font);
    }

    @Override
    public double getPrice() {
        return 100;
    }
}
