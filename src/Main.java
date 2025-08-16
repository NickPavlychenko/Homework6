//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++){
            System.out.println("Целое число " + i);
        }

        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--){
            System.out.println("Целое число " + i);
        }

        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2){
            System.out.println("Четные числа " + i);
        }

        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1){
            System.out.println("Числа " + i);
        }

        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.println("Високосный год " + i);
        }

        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7){
            System.out.println("Число " + i);
        }

        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2){
            System.out.println("Числа " + i);
        }

        System.out.println("Задача 8");
        int savings = 29000;
        int total = 0;
        for (int month = 0; month < 12; month++){
            total += savings;
            System.out.println("Месяц " +(month + 1) + " сумма накоплений равна " +total +" рублей.");
        }

        System.out.println("Задача 9");
        int savingsOne = 29000;
        double totalOne = 0;
        for (int monthOne = 0; monthOne < 12; monthOne++){
            totalOne = totalOne * 1.01;
            totalOne += savingsOne;

            System.out.println(String.format("Месяц %d сумма накоплений равна %.2f рублей.%n", monthOne + 1,totalOne ));
        }

        System.out.println("Задача 10");
        int number = 2;
        for (int i = 1; i < 10; i++){
            number = 2 * i;
            System.out.println("2 * " + i +" = " + 2 * i);
        }





    }
}