package ex02;

import java.util.Locale;

public class Product {
    private final String name;
    private final Integer size;
    private final Double percentage;

    public Product(String name, Integer size, Double percentage) {
        this.name = name;
        this.size = size;
        this.percentage = percentage;
    }


    public String productDescription() {
        if (size==null||percentage==null) return "";
        if ((percentage%1)!=0){
            return String.format(Locale.FRENCH, " • %dCL %.1f%%",size, percentage);
        } else{
            return String.format(Locale.FRENCH, " • %dCL %.0f%%",size, percentage);
        }

    }
}
