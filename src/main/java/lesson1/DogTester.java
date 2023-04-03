package lesson1;

public class DogTester
{
    public static void main(String[] args) {
        Dog trezor = new Dog();
        trezor.setAge(5);
        trezor.setName("Trezor");
        trezor.setBreed("Bulldog");
        trezor.setColor("White");


        System.out.println("Trezor breed is: " + trezor.getBreed());
        trezor.bark();
        Dog eleonora = new Dog("Bolonka", "Eleonora", 3, "White");

        System.out.println("Eleonora's age is: " + eleonora.getAge());
        eleonora.bark();
        System.out.println("Number of dogs: " + Dog.numberOfDogs);
        Dog.hello();
    }
}


class Dog {

    //конструктор

//    public Dog(String dogBreed, String dogName, int dogAge, String dogColor){
//        setBreed(dogBreed);
//        setName(dogName);
//        setAge(dogAge);
//        setColor(dogColor);

//        breed = dogBreed;
//        name = dogName;
//        age = dogAge;
//        color = dogColor;

    //    }
    public Dog(String breed, String name, int age, String color) {
        // this - текущий экземпляр класса
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Dog(){

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age < 30){
            this.age = age;}
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String breed;
    private String name;
    private int age;
    private String color;

    void  bark(){
        System.out.println(name + " bark-bark!");
    }

    public static int numberOfDogs = 2;
    public static void hello (){
        System.out.println("Hello");
    }
    int a = 5;
    int b = 10;

    final int d = 7;
    int e = 12;




}

