package ss7_abstract_interface.animal_edible.animal;
import ss7_abstract_interface.animal_edible.edible.Edible;

public class Chicken extends Animals implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howtoEat(){
        return "Could be fried";
    }
}
