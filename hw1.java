// Написать программу вычисления n-ого треугольного числа

public class hw1 {
    public static void main(String [] args) {
        int number = 10;
        System.out.println(triangleNumber(number));
    }

    public static int triangleNumber(int num) {
        int result = num/2 * (num+1);
        return result;
    }
}