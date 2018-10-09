import meat.BaseMeat;

/**
 * 吊炉烤饼
 *
 * @author itning
 */
public class ShovelScones {
    private BaseMeat baseMeat;
    private Seasoning seasoning;

    /**
     * 构造方法
     *
     * @param baseMeat  肉
     * @param seasoning 调料
     */
    public ShovelScones(BaseMeat baseMeat, Seasoning seasoning) {
        this.baseMeat = baseMeat;
        this.seasoning = seasoning;
    }

    @Override
    public String toString() {
        return "制作肉夹馍\n调料有:" + seasoning + "\n肉:" + baseMeat + " 价格:" + baseMeat.getPrice();
    }

    public ShovelScones addSeasoning(Seasoning.SeasoningItem item) {
        seasoning.addSeasoning(item);
        return this;
    }
}
