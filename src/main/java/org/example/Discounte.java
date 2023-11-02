package org.example;

public class Discounte {
    public static void main(String[] args) {
        int costShirt = 1500; // стоимость без скидки
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

        System.out.println("Стоимость футболки без скидки " + costShirt + " рублей");
        System.out.println("Выбрано рубашек " + quantityShirt);
        System.out.println("Необходимое количество рубашек, для получения скидки " + costDiscount);
        System.out.println("Количество рубашек, которые надо добавить для получения скидки " + quantityDiscont);
        System.out.println("Цена выбранных рубашек без скидки " + totalPriceWithoundDiscont + " рублей");
        System.out.println("Сумма, которую необходимо потратить для добавления рубашек, что бы получить скидку " + remainingQuantity + " рублей");
        System.out.println("Скидка " + discount + " %");
        System.out.println("Цена за 3 рубашки со скидкой " + priceDisc + " рублей");
        System.out.println("Цена за 1 рубашку со скидкой " + oneShirt + " рублей");
        System.out.println("Экономия, если купить 3 рубашки со скидкой, вместо 2-х без скидки " + economy + " рублей");
        System.out.println("Количество халявных рубашек, купленных на сэкономленные деньги " + freebie + " шт.");
    }

    // Цена за 3 рубашки со скидкой
    public static double pricieDiscount(int costShirt, int remainingQuantity, int discount) {
        double sum = (costShirt * 2) + remainingQuantity;
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
