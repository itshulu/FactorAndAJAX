import org.junit.Test;
import work.BeefMeat;
import work.Rougamo;
import work.getSeasoning;


public class App1 {
    @Test
    public void testApp1() throws IllegalAccessException, InstantiationException {
        //张记肉夹馍 店 仅此 一家 —》 单例设计模式
        //肉有两种-》 接口或者抽象类 实现两种肉
        //重构 调料类
        //抽象度不够 没有面向对象
        //命名还算标准 但是 测试类命名不规范
        //调料最好用枚举
       // Rougamo rougamo = new Rougamo(new BeefMeat(), Seasoning.class.newInstance().addCaraway().addCaraway());
    }
}
