public class NewApartment {
    public static void main(String[] args) {

        int apartmentcost = 3000000;
        System.out.println("Стоимость квартиры " + apartmentcost);

        double aninitialfee = 27.9;
        System.out.println("Размер первоначального взноса, в % " + aninitialfee);

        double downpaymentamount = (apartmentcost * aninitialfee) / 100;
        System.out.println("Сумма первоначального взноса, в рублях: "+downpaymentamount);
    }
}
