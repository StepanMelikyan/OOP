import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Product water = new Product("h2o", 15.3);
        System.out.println(water);

        VendingMachine mach1 = new VendingMachine();
        System.out.println(mach1);

        List<Product> tovary = new ArrayList<>();
        tovary.add(water);
        tovary.add(new Product("vine",12));
        tovary.add(new Product("dust",10));
        tovary.add(new Soda("kind", 19));

        // VendingMachine mach2 = new VendingMachine(tovary);
        // System.out.println(mach2);
        // System.out.println(mach2.findByName("kind"));
        // System.out.println(mach2.findByPrice(12));
        // System.out.println(mach2.findByPriceRange(9,13));
        

        List<Product> vkusnoe = new ArrayList<>();

        vkusnoe.add(new Sladkoe("Kit-Kat", 200));
        vkusnoe.add(new Sladkoe("baunty", 150));
        vkusnoe.add(new Sladkoe("twix", 100));
        vkusnoe.add(new Sladkoe("snikers", 250));
    

        VendingMachine mach3 = new VendingMachine(vkusnoe);
        System.out.println(mach3);

    }
}