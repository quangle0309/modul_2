package ss7_abstract_interface.animal_edible;
import ss7_abstract_interface.animal_edible.animal.Chicken;
import ss7_abstract_interface.animal_edible.animal.Tiger;
import ss7_abstract_interface.animal_edible.animal.Animals;

public class TestAbstractAndInterface {
    public static void main(String[] args) {
        Animals[] animals = new Animals[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();

        for (Animals a : animals) {
            System.out.println(a.makeSound());
        }
    }
}
