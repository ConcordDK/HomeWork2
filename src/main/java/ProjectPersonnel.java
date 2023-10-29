public class ProjectPersonnel {

    public static void main(String[] args) {

        int developer = 65;
        System.out.println("Колличество программистов на проекте:"+ developer);

        int qaengineer = 2;
        System.out.println("Колличество тестеровщиков необходимое для проверки работы одного программиста:"+ qaengineer);

        int support = 1;
        System.out.println("Количество специалистов поддержки, необходимое, чтобы обработать вопросы от пользователей, написанного одним программистом:"+ support);

        int multiply1 = qaengineer * developer;
        System.out.println("Колличество тестеровщиков необходимое на проекте:"+ multiply1);

        int multiply2 = support * developer;
        System.out.println("Колличество специалистов поддержки необходимое на проекте:"+ multiply2);

        int sum = multiply1 + multiply2 + developer;
        System.out.println("Общее колличество сотрудников необходимо на проекте:"+ sum);
    }
}