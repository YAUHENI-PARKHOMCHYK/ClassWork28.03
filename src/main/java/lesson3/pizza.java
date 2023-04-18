package lesson3;

public class pizza {

    private PizzaSize size;
    private int ham;
    private int cheese;
    private int peperoni;
    private int pineapple;

    public pizza(PizzaSize size, int ham, int cheese, int peperoni, int pineapple) {
        this.size = size;
        this.ham = ham;
        this.cheese = cheese;
        this.peperoni = peperoni;
        this.pineapple = pineapple;
    }

    public int calculatePrice()
    {
        int price = 0;
        // SMALL 10
        // MIDDLE 12
        // LARGE 14
        switch (size)
        {
            case SMALL:
                price += 10;
                break;
            case MIDDLE:
                price += 12;
                break;
            case LARGE:
                price += 14;
                break;
        }
        // за каждый дополнительный топпинг по 2
        price += (ham + cheese + peperoni + pineapple) * 2;
        return price;
    }



    public static void main(String[] args) {
        pizza p1 = new pizza(PizzaSize.SMALL,1,0,1,3);
        System.out.println(p1.calculatePrice());

    }
}
