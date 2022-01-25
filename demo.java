
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harrymain
 */
public class demo {
    
    static int square(int n){
        int i = n * n;
        return i;
    }
    //squares an integer
    
    static void printPowers(int n){
        System.out.print(n + "\t");
        System.out.print(n * n + "\t");
        System.out.println(n * n * n + "\t");
    }
    // prints out the first three powers of an integer
    
    static int power(int n, int p){
        int result =1;
        for (int i = 0; i < p; i++) {
            result = result * n;
        }
        return result;
    }
    // gets int to power
    
    public static void main(String[] args) {
        int i;
        double x;
        String s;
        
        i = 3;
        x = i / 7.0;
        // test data
        if (x > 0.25) {
            s = " > 0,25";
        } else {
            s = " < 0.25";
        }
        
        System.out.println(x + s);
        
        int[] a = new int[10];
        Scanner in = new Scanner(System.in);
        
        i = 0;
        while (i <10) {
            System.out.print(i + ": ");
            a[i] = in.nextInt();
            i = i + 1;
        }
        
        for (i=0; i<a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        
        System.out.println(i + " squared equals " + square(i));
        int n = 2 * square(i) + 3;
        System.out.println(n);
        
        printPowers(i);
        
        for (int j = 0; j < 6; j++) {
            System.out.println(j + ": " + power(2, j));
        }
    }
    
    
    
}
