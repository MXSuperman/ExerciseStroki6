package MXN;

public class Main {

    public static void main(String[] args) {
        // Exercise 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника — " + fullName);


        // Exercise 2

        String fullNames = "Ivanov Ivan Ivanovich";
        String result = fullNames.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + result);

        // Exercise 3

        String fullNameses = new String("Иванов Семён Семёнович");
        System.out.println(fullNameses.replace('ё' , 'е'));
    }
}
