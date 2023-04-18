package lesson4.animals;

public class BigDogs extends Dog{

    public BigDogs(String name){
        super(name);
    }
    @Override
    public void greets() {
        System.out.println("Wooooof");
    }
    @Override
    public void greets(Dog another) {
        System.out.println("Woooooof");
    }

    public void greets(BigDogs another) {
        System.out.println("Woooooooof");
    }

}
