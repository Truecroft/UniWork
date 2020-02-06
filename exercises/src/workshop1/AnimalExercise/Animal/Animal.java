package workshop1.AnimalExercise.Animal;

public class Animal {
    private String name;
    private int limbCount;
    private String colour;

    public void eat(String food) {
        System.out.println("I'm an animal called " + name + " using some of my " + limbCount + " limbs to eat " + food);
    }
    public void eat(Animal food) {
        System.out.println("I'm an animal called " + name + " using some of my " + limbCount + " limbs to eat " + food);
    }

    public void move(String direction) {
        System.out.println("I'm an animal called " + name + " using some of my " + limbCount + " limbs to move " + direction);
    }

    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLimbCount() {
        return limbCount;
    }

    public void setLimbCount(int limbCount) throws Exception{
        this.limbCount = limbCount;
        if (limbCount < 0 || limbCount > 8){
            throw new Exception("Illegal Limb Count");
        }


    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
