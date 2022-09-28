public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = lastName + firstName+ middleName;
        System.out.println("ФИО сотрудника — " + fullName) ;
        System.out.println("Задание 2");
        fullName= fullName.replace("van", "");
        fullName= fullName.replace("ov", "");
        fullName= fullName.replace("ich", "");
        System.out.println("ФИО сотрудника — " + fullName) ;
        System.out.println("Задание 3");
        String fullName1 = "Иванов Семён Семёнович";
        fullName1= fullName1.replace("ё", "е");
        System.out.println("ФИО сотрудника — " + fullName1) ;

    }
}