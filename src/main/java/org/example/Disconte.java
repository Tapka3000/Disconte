package org.example;

public class Disconte {
    public static void main(String[] args) {
        int costShirt = 1500;
        int quantityShirt = 2;
        int costDiscount = 3;
        int quantityDiscont = 1;
        int totalPriceWithoundDiscont = 3000;
        int remainingQuantity = 1500;
        double discount = 25;
        double priceDisc = pricieDiscount(costShirt, remainingQuantity, (int) discount);
        double oneShirt = oneShirtPrice((int) priceDisc);
        double economy = economyCash(costShirt, quantityShirt, (int) oneShirt);
        double freebie = freebieShirt((int) economy, costShirt);
        System.out.println(freebie);
    }

    // Цена за 3 рубашки со скидкой
    public static double pricieDiscount(int costShirt, int remainingQuantity, int discount) {
        double sum = (int) (costShirt * 2) + remainingQuantity;
        double discountSum = sum / 100 * discount;
        double priceDisc = sum - discountSum;
        return priceDisc;
    }

    // Цена за 1 рубашку со скидкой
    public static double oneShirtPrice(int priceDisc) {
        double oneShirt = priceDisc / 3;
        return oneShirt;
    }

    // Экономия, если купить 3 рубашки со скидкой, вместо 2-х без скидки
    public static double economyCash(int costShirt, int quantityShirt, int oneShirt) {
        int sumWithoutDiscont = costShirt * quantityShirt;
        int discountAmount = oneShirt * 3;
        int economyCash = discountAmount - sumWithoutDiscont;
        return economyCash;
    }

    // Количество халявных рубашек, купленных на сэкономленные деньги
    public static double freebieShirt(int economy, int costShitr) {
        int freebieShirt = costShitr % economy;
        return freebieShirt;
    }
}
