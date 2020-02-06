package workshop1.AnimalExercise.Animal;

public class First {

    public static void main(String[] args) throws Exception {
        Animal animal1 = new Animal();
        animal1.setName("Nathan");
        animal1.setLimbCount(4);
        animal1.setColour("Brown");
        animal1.move("South");
        animal1.eat("Grapes");
        Animal animal2 = new Animal();
        animal2.setName("Dom");
        animal2.setLimbCount(3);
        animal2.setColour("Black");
        animal2.move("North");
        animal2.eat("Banana");
        animal2.eat(animal1);
    }
}
