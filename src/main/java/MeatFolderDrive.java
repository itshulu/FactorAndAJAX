/**
 * 制作肉夹馍
 *
 * @author itning
 */
public class MeatFolderDrive {
    public static void main(String[] args) {
        //单例设计模式
        ZhangJiShop zhangJiShop = ZhangJiShop.getInstance();

        //工厂设计模式
        ShovelScones shovelScones1 = zhangJiShop.beefMeatShovelSconesFactory(Seasoning.SeasoningItem.Chili, Seasoning.SeasoningItem.Shallot);
        System.out.println(shovelScones1);

        ShovelScones shovelScones2 = zhangJiShop.porkMeatShovelSconesFactory();
        System.out.println(shovelScones2);

        //构造参数过多考虑构建器
        ShovelScones shovelScones = zhangJiShop.porkMeatShovelSconesFactory()
                .addSeasoning(Seasoning.SeasoningItem.Chili)
                .addSeasoning(Seasoning.SeasoningItem.Parsley)
                .addSeasoning(Seasoning.SeasoningItem.Shallot);
        System.out.println(shovelScones);
    }
}
