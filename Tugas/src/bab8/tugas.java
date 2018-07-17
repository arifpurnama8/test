package bab8;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class tugas {
    public static void main(String[] args) throws IOException{
        DecimalFormat jmldigit;
        jmldigit = new DecimalFormat("0,000.0"); // untuk desimal format
        
        Scanner input = new Scanner(System.in);
        
        String nama, tanggal;
        int i,n,totalbayar=0,item=0;
        
        int[]jumlah,harga,total;
        String[] kodebarang,namabarang;
        
        //objek array
        jumlah = new int [10];
        harga = new int[10];
        total = new int [10];
        kodebarang = new String[10];
        namabarang = new String[10];
        
        //input
        System.out.println("PT. Permata Pratama ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Masukan Nama Petugas       : ");
        nama = input.nextLine();
        System.out.print("Masukan Tanggal Petugas    : ");
        tanggal = input.nextLine();
        System.out.print("Jumlah Beli                : ");
        n = input.nextInt();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        //pengulangan
        for (i =1; i<=n ;i++){
            System.out.println("Data ke -" + i);
            System.out.print("Kode Barang     : ");
            kodebarang[i] = input.next();
            System.out.print("Jumlah          : ");
            jumlah[i] = input.nextInt();
            
            if (kodebarang[i].equalsIgnoreCase("P001")){
                namabarang[i] = "Printer";
                harga[i] = 700000;
            } else if (kodebarang[i].equalsIgnoreCase("V001")){
                namabarang[i] = "VGA Card";
                harga[i] = 75000;
            } else if (kodebarang[i].equalsIgnoreCase("M001")){
                namabarang[i] = "MotherBoard";
                harga[i] = 950000;
            }else {
                namabarang[i] = "Tidak Ada";
                harga[i] = 0;
            }
          total[i] = harga[i] * jumlah[i];
          totalbayar = totalbayar + total[i];
          item = item +jumlah[i];
        }
        
        //output
        System.out.println("\nPT. PERMATA PRATAMA");
        System.out.println("===========================================================================================");
        System.out.println("Nama Petugas    : " +nama+ "\t\tTanggal : " +tanggal);
        System.out.println("Jumlah data     : " +n);
        System.out.println("===========================================================================================");
        System.out.println("No.\t Kode Barang\t Nama Barang\t Harga Barang\t Jumlah Barang\t Total Harga\t");
        System.out.println("===========================================================================================");
        
        for (i=1; i <=n; i++){
            System.out.println(i+ "\t " +kodebarang[i]+ "\t\t  " +namabarang[i]+ "\t Rp. " +jmldigit.format(harga[i])+ "\t\t" +jumlah[i]+ "\t Rp. " +jmldigit.format(total[i]));
        }
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Total penjualan pada " +tanggal+ " sebanyak "+item+ " item sebesar Rp. " + jmldigit.format(totalbayar));
    }
}
