package Person;

public class IntersexFactory implements HumanFactory{
    @Override
    public Human createYellowHuman() {
        return new IntersexYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new IntersexWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new IntersexBlackHuman();
    }
}
