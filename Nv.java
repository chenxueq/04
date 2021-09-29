package Factory;

public class Nv {
    public static void main(String[] args) {
        AbstractHumanFactory factory = new HumanFactory();
        Human black = (Human) factory.createHuman(BlackHuman.class);
        Human white = factory.createHuman(WhiteHuman.class);
        Human yellow = factory.createHuman(YellowHuman.class);
        black.getColor();
        black.talk();
        white.getColor();
        white.talk();
        yellow.getColor();
        yellow.talk();
    }
}
