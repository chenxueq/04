package Farm;
public class A_Cattle implements Animal{

    public A_Cattle() {
        System.out.println("这里创建了一只牛");
    }

    @Override
    public void show() {
        System.out.println("我是耗牛");
    }
}
