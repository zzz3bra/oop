package by.tms.examples.oop.inheritance;

public class ExampleObjectsInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.displayInfoForCat();
        cat.displayInfo();
        cat.meow();

        Dog dog = new Dog();
        dog.displayInfo();
        dog.bark();

        Animal animalDog = dog; // присвоили ссылку на объект
        Animal animalCat = cat; // присвоили ссылку на объект
        Animal animal = Animal.newAnimal(100, "ЖЫВОТНАЕ");

        printInfo(cat);
        printInfo(dog);
        printInfo(animal);
        GrumpyCat grumpyCat = new GrumpyCat();
        printInfo(grumpyCat);
        ChattyDog chattyDog = new ChattyDog();
        printInfo(chattyDog);
        chattyDog.bark(5L); // overloading
    }

    private static void printInfo(Animal animal) {
        System.out.println(animal);
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.meow();
        } else {
            System.out.println("Just some animal");
        }
        animal.speak(); //полиморфизм
    }
}
