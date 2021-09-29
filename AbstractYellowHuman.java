package Person;

public abstract  class AbstractYellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("我是黄种人");
    }
    @Override
    public void talk() {
        System.out.println("yellowyellow");
    }
}
