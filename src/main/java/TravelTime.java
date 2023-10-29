public class TravelTime {
    public static void main(String[] args) {

        int DistanceHomeToOffice = 3;
        System.out.println("Расстояние от дома до офиса, км: " + DistanceHomeToOffice);

        double AverageTaxiSpeed = 20;
        System.out.println("Средняя скорость такси, км/ч: " + AverageTaxiSpeed);

        double NormalTravelTime = DistanceHomeToOffice / AverageTaxiSpeed;
        System.out.println("Время затраченное на поездку от дома до офиса, без коэффициента пробок: " + NormalTravelTime);

        double CoefficientRoadProblemm = 1.5;
        System.out.println("Коэффициент заторов на дороге: " + CoefficientRoadProblemm);

        double HardTravelTime = NormalTravelTime * CoefficientRoadProblemm;
        System.out.println("Время затраченное на поездку от дома до офиса, с учетом коэффициента пробок: " + HardTravelTime);


    }
}
