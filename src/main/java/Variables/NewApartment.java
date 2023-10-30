package Variables;

public class NewApartment {
    public static void main(String[] args) {
        int apartmentCost = 3000000;
        System.out.println("Стоимость квартиры " + apartmentCost);

        double anInitialFee = 27.9;
        System.out.println("Размер первоначального взноса, в % " + anInitialFee);

        double downPaymentAmount = (apartmentCost * anInitialFee) / 100;
        System.out.println("Сумма первоначального взноса, в рублях: " + downPaymentAmount);
    }
}
