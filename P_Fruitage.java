package Farm;
public class P_Fruitage implements Plant{
    public P_Fruitage() {
        System.out.println("这里创建了一个水果");
    }

    @Override
    public void show() {
        System.out.println("我是苹果");
    }
}
