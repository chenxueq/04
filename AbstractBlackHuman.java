package Person;

public abstract  class AbstractBlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("我是黑种人");
    }
    @Override
    public void talk() {
        System.out.println("blackblack");
    }


}
