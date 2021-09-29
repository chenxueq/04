package Farm;
public class Test {
    public static void main(String[] args) {
        SGfarm sGfarm=new SGfarm();
        Animal animal= sGfarm.newAnimal();
        animal.show();
        Plant plant=sGfarm.newPlant();
        plant.show();
        SRfarm sRfarm=new SRfarm();
        animal= sRfarm.newAnimal();
        animal.show();
        plant=sRfarm.newPlant();
        plant.show();
    }
}
