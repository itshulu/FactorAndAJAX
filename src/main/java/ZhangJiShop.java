import meat.BaseMeat;
import meat.BeefMeat;
import meat.PorkMeat;

/**
 * 张记
 *
 * @author itning
 */
public class ZhangJiShop {
    private static final ZhangJiShop ZHANG_JI_SHOP = new ZhangJiShop();

    private ZhangJiShop() {
    }

    public static ZhangJiShop getInstance() {
        return ZHANG_JI_SHOP;
    }

    private ShovelScones shovelSconesFactory(BaseMeat baseMeat, Seasoning seasoning) {
        return new ShovelScones(baseMeat, seasoning);
    }

    public ShovelScones beefMeatShovelSconesFactory(Seasoning.SeasoningItem... seasoningItem) {
        return shovelSconesFactory(new BeefMeat(), new Seasoning(seasoningItem));
    }

    public ShovelScones porkMeatShovelSconesFactory(Seasoning.SeasoningItem... seasoningItem) {
        return shovelSconesFactory(new PorkMeat(), new Seasoning(seasoningItem));
    }
}
