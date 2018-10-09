import org.junit.Test;
import util.classtest;

public class App {
    @Test
    public void testApp(){
        classtest classtest = new classtest();
        classtest.setYear(2018);
        classtest.setMonth(2);
        classtest.setDay(28);
        classtest.nextdate();
    }
}
