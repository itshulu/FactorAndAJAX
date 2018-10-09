import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 调料
 *
 * @author itning
 */
public class Seasoning {
    private Set<SeasoningItem> seasoningItemSet;

    public enum SeasoningItem {
        /**
         * 辣椒
         */
        Chili("辣椒"),
        /**
         * 香菜
         */
        Parsley("香菜"),
        /**
         * 麻酱
         */
        HempSauce("麻酱"),
        /**
         * 葱
         */
        Shallot("葱");

        private String name;

        SeasoningItem(String name) {
            this.name = name;
        }
    }

    public Seasoning(SeasoningItem... items) {
        seasoningItemSet = new HashSet<>();
        seasoningItemSet.add(SeasoningItem.HempSauce);
        seasoningItemSet.addAll(Arrays.asList(items));
    }

    public void addSeasoning(SeasoningItem item) {
        seasoningItemSet.add(item);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        seasoningItemSet.forEach(seasoningItem -> stringBuilder.append(seasoningItem.name).append(" "));
        return stringBuilder.toString();
    }
}