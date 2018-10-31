package Terminal;

import java.util.WeakHashMap;

public class Terminal {

    int totalPrice = 0;
    int price = 0;

    WeakHashMap<String, Integer> products = new WeakHashMap<String, Integer>();


    void setPrice(String productName, int price) {
        products.put(productName, price);
    }


    public int purchase() {


        return price;
    }

    public int calculate() {


        return totalPrice;
    }
}
