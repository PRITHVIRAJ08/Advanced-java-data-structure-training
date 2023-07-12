import java.io.*;
import  java.util.*;

public class Main {
    public static void main(String[] args) {
        int N = 7;
        int result = isPrime(N);
        System.out.println("Result: " + result);
    }

    public static int isPrime(int N) {
        if (N < 2)
            return 1;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0)
                return 1;
        }

        return 2;
    }
}
