package Factory;

public class HumanFactory implements AbstractHumanFactory{
    @Override
    public Human createHuman(Class clazz) {
        Human human = null;
        try {
            human = (Human) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }finally {
            return human;
        }
    }
}
