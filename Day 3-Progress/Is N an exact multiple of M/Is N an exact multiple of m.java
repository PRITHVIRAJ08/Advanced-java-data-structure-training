import java.io.*;
import  java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = 15;
        int m = 5;
        int result = checkMultiples(n, m);
        System.out.println("Result: " + result);
    }

    public static int checkMultiples(int n, int m) {
        if (n == 0 || m == 0) {
            return 3;
        } else if (n % m == 0) {
            return 2;
        } else {
            return 1;
        }
    }
}
