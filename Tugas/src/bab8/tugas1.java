package bab8;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) throws IOException{
        DecimalFormat digit = new DecimalFormat("0,000.0");
        Scanner input = new Scanner(System.in);
        
        //variable
        String nama, tanggal;
        int i,n,totalbayar = 0,item = 0;
        
        //array
        int[]jumlah,harga,total;
        String[] kodebarang,namabarang;
        
        jumlah = new int [10];
        harga = new int [10];
        total = new int [10];
        kodebarang = new String[10];
        namabarang = new String[10];
        
        //inputan
        System.out.println("PT. Permata Pratama ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("Masukan Nama Petugas        : ");
        nama = input.nextLine();
        System.out.print("Masukan Tanggal             : ");
        tanggal = input.nextLine();
        System.out.print("Jumlah Beli                 : ");
        n = input.nextInt();
        
        //perulangan
        for (i =1; i<=n ; i++){
            System.out.println("\nData Ke- " +i);
            System.out.print("Kode Barang     : ");
            kodebarang[i]=input.next();
            System.out.print("Jumlah Beli     : ");
            jumlah[i]=input.nextInt();
            
                if (kodebarang[i].equalsIgnoreCase("P001")){
                    namabarang[i] = "Printer";
                    harga[i] = 700000;
                }else if (kodebarang[i].equalsIgnoreCase("V001")){
                    namabarang[i] = "VGA Card";
                    harga[i] = 75000;
                }else if (kodebarang[i].equalsIgnoreCase("M001")){
                    namabarang[i] = "MotherBoard";
                    harga[i]= 90000;
                }else {
                    kodebarang[i] = "Tidak Ada";
                    namabarang[i] = "Tidak Ada";
                    harga[i] = 0;
                }
                
                if (namabarang[i].equalsIgnoreCase("Tidak Ada")){
                    jumlah[i] =0;
                }
                
                total[i] = harga[i] * jumlah[i];
                totalbayar = totalbayar + total[i];
                item = item + jumlah[i];
        }
        //Tampilan
        System.out.println("\nPT. PERMATA PRATAMA");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Nama Pegutas    : " +nama+ "\t\t\tTanggal : "+tanggal);
        System.out.println("Jumlah Data     : " +n);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("No\t Kode Barang\t\t Nama Barang\t Harga Barang\t Jumlah Barang\t Total Bayar\t");
        System.out.println("------------------------------------------------------------------------------------------");
        
        for (i=1; i<=n; i++){
            System.out.println(i+ "\t " +kodebarang[i]+ "\t\t " +namabarang[i]+ "\t Rp. " +digit.format(harga[i]) +"\t\t" +jumlah[i]+ "\t Rp. " +digit.format(total[i]));
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Total penjualan pada " +tanggal+ " sebanyak " +item+ " item sebesar Rp. " +digit.format(totalbayar));
    }
    
}
