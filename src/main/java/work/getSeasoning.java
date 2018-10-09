package work;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class getSeasoning {
    private Set<Seasoning> seasoningItemSet;
    public enum Seasoning {

        hot("辣椒"), onion("大葱"), caraway("香菜"),majiang("麻酱");
        private String data;

        Seasoning(String data) {
            this.data=data;
        }

        @Override
        public String toString() {
            return data ;
        }
    }
    public getSeasoning(Seasoning... items) {
        seasoningItemSet = new HashSet<>();
        seasoningItemSet.add(Seasoning.majiang);
        seasoningItemSet.addAll(Arrays.asList(items));
    }

    public void addSeasoning(Seasoning item) {
        seasoningItemSet.add(item);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        seasoningItemSet.forEach(seasoningItem -> stringBuilder.append(seasoningItem.data).append(" "));
        return stringBuilder.toString();
    }
}
