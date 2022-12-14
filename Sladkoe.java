public class Sladkoe extends Product{

    public Sladkoe(String name, double price) {
        super(name, price);
    }



    public String toString()  {
        return String.format("%s - %f",name, price);
    }
}