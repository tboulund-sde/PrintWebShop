package dk.easv.products;

public abstract class Product {
    private String text;
    private String font;
    private double price;

    protected Product(String text, String font) {
        this.setText(text);
        this.setFont(font);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public abstract double getPrice();
}
