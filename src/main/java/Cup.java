public class Cup {
    public static void main(String[] args) {

        int volume = 250;
        System.out.println("Объем стакана: " + volume);

        double poured = 64.4;
        System.out.println("На столько процентов заполнен стакан: " + poured);

        double ost = (volume * poured) / 100;
        System.out.println("Столько миллилитров воды в стакане заполнено: " + ost);
    }
}
