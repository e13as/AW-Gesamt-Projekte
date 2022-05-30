package de.awacademy.shop;

public class Main {

    public static void main(String[] args) {

        Product p1 = new Product("Ball", Category.TOOLS);
        System.out.println(p1.getCategory());
        Product p2 = new Product("Pingo", Category.FOOD);
        Product p3 = new Product("Word", Category.TOOLS);

        ShoppingCart shoppingCart = new ShoppingCart();
        System.out.println(Double.valueOf(1234).toString());


        String str = new String();
        System.out.println(str.isEmpty());
        System.out.println(str == null);
        str = 10 + "0";
        System.out.println(str);
        System.out.println(str.getClass().getName());

    }
}
