package util;

public class Meat {
    private float price;
    private String meat;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Meat addBeef(){
        meat="牛肉";
        price=3.5f;
        return this;
    }
    public Meat addProk(){
        meat="猪肉";
        price=3.0f;
        return this;
    }

    @Override
    public String toString() {
        return  meat + '：'+ price  ;
    }
}
