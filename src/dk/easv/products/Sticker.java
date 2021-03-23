package dk.easv.products;

public class Sticker extends Product {

    protected Sticker(String text, String font) {
        super(text, font);
    }

    @Override
    public double getPrice() {
        return 5;
    }
}
