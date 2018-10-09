package meat;

/**
 * 牛肉
 *
 * @author itning
 */
public class BeefMeat extends BaseMeat {
    @Override
    public double getPrice() {
        return 3.5;
    }

    @Override
    public String toString() {
        return "牛肉";
    }
}
