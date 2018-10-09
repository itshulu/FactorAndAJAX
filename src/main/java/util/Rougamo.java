package util;

/**
 * ？？？
 * @author 舒露
 */
public class Rougamo {

    private Meat meat;
    private Seasoning seasoning;

    /**
     * 如果这是个Entity 必须给空构造方法
     * @param meat
     * @param seasoning
     */
    public  Rougamo(Meat meat, Seasoning seasoning) {
        this.meat=meat;
        this.seasoning=seasoning;
    }

    public Meat getMeat() {
        return meat;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public Seasoning getSeasoning() {
        return seasoning;
    }

    public void setSeasoning(Seasoning seasoning) {
        this.seasoning = seasoning;
    }

    public Rougamo() {
    }

    @Override
    public String toString() {
        return meat  +"'\n"
                + seasoning ;
    }

}
