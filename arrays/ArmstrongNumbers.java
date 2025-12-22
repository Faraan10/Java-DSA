package arrays;

import java.util.Scanner;

public class ArmstrongNumbers {
    
    public static int power(int base, int exp) {
    int val = 1;
    for (int i = 1; i <= exp; i++) {
        val *= base;
    }
    return val;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i <= N; i++) {

            int temp = i;
            int count = 0;

            // count digits
            if (temp == 0) {
                count = 1;
            } else {
                while (temp != 0) {
                    temp /= 10;
                    count++;
                }
            }

            temp = i;
            int sum = 0;

            // calculate Armstrong sum
            if (temp == 0) {
                sum = 0;
            } else {
                while (temp != 0) {
                    int digit = temp % 10;
                    sum += power(digit, count);
                    temp /= 10;
                }
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
