package util;


public class Seasoning {
    private String hot;
    private String mahjong = "麻酱";
    private String caraway;
    private String onion;

    public Seasoning addHot() {
        hot = "辣椒";
        return this;
    }

    public Seasoning addOnion() {
        onion = "大葱";
        return this;
    }

    public Seasoning addCaraway() {
        caraway = "香菜";
        return this;
    }

    @Override
    public String toString() {
        return "调料" +
                hot +
                mahjong +
                caraway +
                onion;
    }
}
