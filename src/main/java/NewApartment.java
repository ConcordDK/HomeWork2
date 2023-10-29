public class NewApartment {
    public static void main(String[] args) {

        int ApartmentCost = 3000000;
        System.out.println("Стоимость квартиры " + ApartmentCost);

        double AnInitialFee = 27.9;
        System.out.println("Размер первоначального взноса, в % " + AnInitialFee);

        double DownPaymentAmount = (ApartmentCost * AnInitialFee) / 100;
        System.out.println("Сумма первоначального взноса, в рублях: " + DownPaymentAmount);
    }
}
