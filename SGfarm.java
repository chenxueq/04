package Farm;
public class SGfarm implements Farm{
    private Object A_Cattle;

    @Override
    public Animal newAnimal() {
        return new A_Cattle();
    }

    @Override
    public Plant newPlant() {
        return new P_Vegetables() ;
    }
}
