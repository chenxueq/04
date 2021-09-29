package Person;

public abstract  class AbstractWhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("我是白种人");
    }
    @Override
    public void talk() {
        System.out.println("whitewhite");
    }

}
