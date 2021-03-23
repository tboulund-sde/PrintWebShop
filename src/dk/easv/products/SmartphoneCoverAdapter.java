package dk.easv.products;

import ext.smartphone.partner.SmartphoneCover;

public class SmartphoneCoverAdapter extends Product {
    private final SmartphoneCover partnerCover;

    protected SmartphoneCoverAdapter(SmartphoneCover partnerCover) {
        super(partnerCover.getQuote(), "Tahoma");
        this.partnerCover = partnerCover;
    }

    protected SmartphoneCoverAdapter(String text, String font) {
        super(text, font);
        partnerCover = null;
    }

    @Override
    public double getPrice() {
        return partnerCover.getPrice() * 1.05;
    }
}
