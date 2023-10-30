package Variables;

public class Saruman {

    public static void main(String[] args) {
        int soldierLannister = 12530;
        System.out.println("Колличество войск у дома Ланнистеров: " + soldierLannister);

        int sarumanUrukhai = 256245;
        System.out.println("Колличество Урукхаев у Сарумана: " + sarumanUrukhai);

        int unionSarumanAndLannister = sarumanUrukhai + soldierLannister;
        System.out.println("Колличество войск, после союза дома Ланнистеров и Сарумана: " + unionSarumanAndLannister);
    }
}