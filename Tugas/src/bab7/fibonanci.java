/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab7;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class fibonanci {
    public static void main(String[] args) {
        Scanner show = new Scanner(System.in);
        System.out.print("Masukan Jumlah Deret Fibonanci : ");
        int n = show.nextInt();
        long fib[] = new long[n];
        
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i =2; i<n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        for (int i=1; i<n; i++){
            System.out.print(fib[i] + " ");
        }
    }
}
