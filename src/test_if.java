import java.util.Scanner;

public class test_if {
    public static void main(String[] args) {

        System.out.print("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int a = inputFigure.nextInt();
        if (a==1) {
            System.out.println("Вы ввели число 1");
        }
        else if (a==2) {
            System.out.println("Вы ввели число 2");
        }
        else if (a==3) {
            System.out.println("Вы ввели число 3");
        }
        else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
        }
    }
}
