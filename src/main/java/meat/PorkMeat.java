package meat;

/**
 * 猪肉
 *
 * @author itning
 */
public class PorkMeat extends BaseMeat {
    @Override
    public double getPrice() {
        return 3;
    }

    @Override
    public String toString() {
        return "猪肉";
    }
}
