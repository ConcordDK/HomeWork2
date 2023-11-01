package Variables;

public class MilkyWay {

    public static void main(String[] args) {
        int ageOfTheUniverse = 130000000;
        System.out.println("Возраст вселенной: " + ageOfTheUniverse);

        int ageOfTheHumanSpecies = 100000;
        System.out.println("Возраст человеческого вида: " + ageOfTheHumanSpecies);

        int difference = ageOfTheUniverse / ageOfTheHumanSpecies;
        System.out.println("Во сколько раз Вселенная старше людей: " + difference);
    }
}
