package lesson4.animals;

public class AnimalsTester {
    public static void main(String[] args) {
        Cat cat = new Cat("Kitty");
        cat.greets();
        Dog dog = new Dog("Peter");
        dog.greets(dog);

        Dog bigDog = new BigDogs("volk");
        dog.greets(bigDog);
        bigDog.greets(dog);
        bigDog.greets(bigDog);

    }
}
