package Variables;

public class TravelTime {
    public static void main(String[] args) {
        int distanceHomeToOffice = 3;
        System.out.println("Расстояние от дома до офиса, км: " + distanceHomeToOffice);

        double averageTaxiSpeed = 20;
        System.out.println("Средняя скорость такси, км/ч: " + averageTaxiSpeed);

        double normalTravelTime = distanceHomeToOffice / averageTaxiSpeed;
        System.out.println("Время затраченное на поездку от дома до офиса, без коэффициента пробок: " + normalTravelTime);

        double coefficientRoadProblemm = 1.5;
        System.out.println("Коэффициент заторов на дороге: " + coefficientRoadProblemm);

        double hardTravelTime = normalTravelTime * coefficientRoadProblemm;
        System.out.println("Время затраченное на поездку от дома до офиса, с учетом коэффициента пробок: " + hardTravelTime);
    }
}