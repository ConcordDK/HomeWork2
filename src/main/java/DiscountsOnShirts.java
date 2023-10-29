public class DiscountsOnShirts {

    public static void main(String[] args) {

        int OneShirtsNoDiscount = 2534;
        System.out.println("Цена одной рубашки без скидки: " + OneShirtsNoDiscount);

        int SelectedShirts = 20;
        System.out.println("Количество уже выбранных рубашек: " + SelectedShirts);

        int NumberFofShirtsForDiscount = 25;
        System.out.println("Колличество, которое надо купить, чтобы получить скидку: " + NumberFofShirtsForDiscount);

        int ShirtsForDiscount = NumberFofShirtsForDiscount - SelectedShirts;
        System.out.println("Колличество рубашек, которые надо добавить к купленным: " + ShirtsForDiscount);

        int TotalPriceShirtsNoDiscount = OneShirtsNoDiscount * SelectedShirts;
        System.out.println("Общая цена уже выбранных рубашек без скидки: " + TotalPriceShirtsNoDiscount);

        int TotalPriceShirtsForDiscount = OneShirtsNoDiscount * NumberFofShirtsForDiscount;
        System.out.println("Общая цена рубашек (без скидки), которые надо докупить, чтобы получить скидку: " + TotalPriceShirtsForDiscount);

        double Discount = 25;
        System.out.println("Процент скидки: " + Discount);

        double TotalPriceShirtsOnDiscount = OneShirtsNoDiscount * NumberFofShirtsForDiscount - TotalPriceShirtsForDiscount * Discount / 100;
        System.out.println("Цена всех рубашек со скидкой: " + TotalPriceShirtsOnDiscount);

        double OneShirtsOnDiscount = TotalPriceShirtsOnDiscount / NumberFofShirtsForDiscount;
        System.out.println("Цена одной рубашки со скидкой: " + OneShirtsOnDiscount);

        double TotalSaleShirts = TotalPriceShirtsForDiscount - TotalPriceShirtsOnDiscount;
        System.out.println("Количество сэкономленных денег, если рубашки куплены со скидкой: " + TotalSaleShirts);

        double FreeShirts = TotalSaleShirts / OneShirtsNoDiscount;
        System.out.println("Колличество рубашек полученные бесплатно, благодаря полученной скидке: "+FreeShirts);




    }
}
