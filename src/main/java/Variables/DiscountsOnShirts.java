package Variables;

public class DiscountsOnShirts {

    public static void main(String[] args) {
        int oneShirtsNoDiscount = 2534;
        System.out.println("Цена одной рубашки без скидки: " + oneShirtsNoDiscount);

        int selectedShirts = 20;
        System.out.println("Количество уже выбранных рубашек: " + selectedShirts);

        int numberFofShirtsForDiscount = 25;
        System.out.println("Колличество, которое надо купить, чтобы получить скидку: " + numberFofShirtsForDiscount);

        int shirtsForDiscount = numberFofShirtsForDiscount - selectedShirts;
        System.out.println("Колличество рубашек, которые надо добавить к купленным: " + shirtsForDiscount);

        int totalPriceShirtsNoDiscount = oneShirtsNoDiscount * selectedShirts;
        System.out.println("Общая цена уже выбранных рубашек без скидки: " + totalPriceShirtsNoDiscount);

        int totalPriceShirtsForDiscount = oneShirtsNoDiscount * numberFofShirtsForDiscount;
        System.out.println("Общая цена рубашек (без скидки), которые надо докупить, чтобы получить скидку: " + totalPriceShirtsForDiscount);

        double discount = 25;
        System.out.println("Процент скидки: " + discount);

        double totalPriceShirtsOnDiscount = oneShirtsNoDiscount * numberFofShirtsForDiscount - totalPriceShirtsForDiscount * discount / 100;
        System.out.println("Цена всех рубашек со скидкой: " + totalPriceShirtsOnDiscount);

        double oneShirtsOnDiscount = totalPriceShirtsOnDiscount / numberFofShirtsForDiscount;
        System.out.println("Цена одной рубашки со скидкой: " + oneShirtsOnDiscount);

        double totalSaleShirts = totalPriceShirtsForDiscount - totalPriceShirtsOnDiscount;
        System.out.println("Количество сэкономленных денег, если рубашки куплены со скидкой: " + totalSaleShirts);

        double freeShirts = totalSaleShirts / oneShirtsNoDiscount;
        System.out.println("Колличество рубашек полученные бесплатно, благодаря полученной скидке: " + freeShirts);
    }
}