/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab7;

/**
 *
 * @author lenovo
 */
public class ganjil {
    public static void main(String[] args) {
        int a, jumlah = 0;
        for (a=1 ; a<=20; a+=2){
            
            if (a<19){
                System.out.print(a);
                System.out.print("+");
            }else {
                System.out.print(a);
                }
            jumlah = jumlah+a;
        }
        System.out.print("=");
        System.out.print(jumlah);
    }
}
