public class TravelTime {
    public static void main(String[] args) {

        int distancehometooffice = 3;
        System.out.println("Расстояние от дома до офиса, км: " + distancehometooffice);

        double averagetaxispeed = 20;
        System.out.println("Средняя скорость такси, км/ч: " + averagetaxispeed);

        double normaltraveltime = distancehometooffice / averagetaxispeed;
        System.out.println("Время затраченное на поездку от дома до офиса, без коэффициента пробок: " + normaltraveltime);

        double coefficientroadproblemm = 1.5;
        System.out.println("Коэффициент заторов на дороге: "+ coefficientroadproblemm);

        double hardtraveltime = normaltraveltime * coefficientroadproblemm;
        System.out.println("Время затраченное на поездку от дома до офиса, с учетом коэффициента пробок: " + hardtraveltime);


    }
}
