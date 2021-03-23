package dk.easv.products;

import ext.smartphone.partner.SmartphoneCover;

public class ProductFactory {
    public enum ProductType {
        Shirt,
        Sticker,
        Poster,
        SmartphoneCover
    }

    public Product createProduct(ProductType type, String text, String font) {
        switch (type) {
            case Shirt:
                return new Shirt(text, font);
            case Poster:
                return new Poster(text, font);
            case Sticker:
                return new Sticker(text, font);
            case SmartphoneCover:
                SmartphoneCover partnerCover = new SmartphoneCover();
                partnerCover.setQuote(text);
                return new SmartphoneCoverAdapter(partnerCover);
            default:
                return null;
        }
    }
}
