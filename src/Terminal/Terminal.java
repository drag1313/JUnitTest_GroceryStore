package Terminal;

import java.util.WeakHashMap;

public class Terminal {

    int totalPrice = 0;
    int price = 0;
    int countMilk = 0;
    int countChips = 0;
    int countCola = 0;

    WeakHashMap<String, Integer> products = new WeakHashMap<String, Integer>();


    void setPrice(String productName, int price) {
        products.put(productName, price);
    }


    public void purchase(String productName) {
        if (products.containsKey(new String(productName))) {
            price = products.get(productName);
            totalPrice += price;
        }
        switch (productName) {
            case "Молоко":
                countMilk = countMilk + 1;
                break;
            case "Кола":
                countCola = countCola + 1;
                break;
            case "Чипсы":
                countChips = countChips + 1;
                break;
        }
    }

    public int calculate() {
        if (countMilk > 2) {
            totalPrice = totalPrice - ((countMilk / 3) * 31);
        }
        if (countChips > 3) {
            totalPrice = totalPrice - ((countChips / 4) * 31);
        }
        if (countCola > 1) {
            totalPrice = totalPrice - ((countCola / 2) * 39);
        }
        return totalPrice;
    }
}

