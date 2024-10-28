/*
3. Problem Statement: Animal Rescue Center
Objective: Design a system for an animal rescue center that manages different animal types (e.g., Dog, Cat, and Bird).
Each animal type should have its own method to describe care requirements.

Logic-Building Method for Overriding:
Common Superclass: Create a superclass Animal with a method describeCareRequirements().
Subclass Customization: Define subclasses (Dog, Cat, Bird) that override describeCareRequirements()
to provide specific care instructions for each animal type.
Care Instructions: Create a collection of Animal objects
and invoke describeCareRequirements() to display care instructions for each type.
*/
class Animal{
    String name;
    public Animal(String name){
        this.name = name ;
    }
    void describeCareRequirements(){
        System.out.println("General care is required for the animal.");
    }
}
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    void describeCareRequirements() {
        System.out.println("Type: Dog");
        System.out.println("Dog Care Instructions:");
        System.out.println("- Provide daily walks and playtime.");
        System.out.println("- Ensure a balanced diet and fresh water.");
        System.out.println("- Regular grooming and vet check-ups are needed.");
        System.out.println("------------------------------------------------------------");
    }
}
class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
    void describeCareRequirements() {
        System.out.println("Type: Cat");
        System.out.println("Cat Care Instructions:");
        System.out.println("- Provide a quiet place to rest and play.");
        System.out.println("- Maintain a clean litter box.");
        System.out.println("- Regular grooming and mental stimulation are necessary.");
        System.out.println("------------------------------------------------------------");
    }
}
class Bird extends Animal{
    String name;
    public Bird(String name){
        super(name);
    }

    @Override
    void describeCareRequirements() {
        System.out.println("Type: Bird");
        System.out.println("Bird Care Instructions:");
        System.out.println("- Ensure a spacious cage with toys for stimulation.");
        System.out.println("- Provide fresh seeds, fruits, and water daily.");
        System.out.println("- Allow supervised flying time outside the cage.");
        System.out.println("------------------------------------------------------------");
    }
}

public class Care_Instructions {
    public static void main(String[] args) {
        Animal[] a = new Animal[3];
        a[0] = new Dog("Buddy");
        a[1] = new Cat("Whiskers");
        a[2] = new Bird("Tweety");
        for (int i = 0; i < 3; i++){
            System.out.println("Name of animal: "+ a[i].name);
            a[i].describeCareRequirements();
        }

    }
}
