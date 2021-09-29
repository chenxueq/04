package Farm;
public class SRfarm implements Farm{
    @Override
    public Animal newAnimal() {
        return new A_Horse();
    }

    @Override
    public Plant newPlant() {
        return new P_Fruitage();
    }
}
