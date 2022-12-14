public class Soda extends Product{
    public Soda(String name, double price) {
        super(name, price);
        
    }
 

    public String toString(){
        return String.format("%s - %f", name, price);
    }
}