package bab5;
import java.util.Scanner;
public class InputData {
   public String namakaryawan, pendidikan;
   public int golongan, jamkerja,tunhonor,jumlahhonor;
   public double tunjab,tunpen;
   final int gapok = 300000, lamakerja = 8;
   
    Scanner input = new Scanner(System.in);
    
    public void setInputData(){
        System.out.print("Nama Karyawan       : ");
        namakaryawan = input.nextLine();
        System.out.print("Golongan            : ");
        golongan = input.nextInt();
        System.out.print("Pendidikan          : ");
        pendidikan = input.next();
        System.out.print("Jam Kerja           : ");
        jamkerja = input.nextInt();
    }
    
    public double TunjanganJabatan(){
        switch (golongan){
            case 1:
                tunjab = 0.05*gapok;
                break;
            case 2:
                tunjab = 0.1*gapok;
                break;
            case 3:
                tunjab = 0.15*gapok;
                break;
            default:
                tunjab = 0;
                break;
        }
        return golongan;
    }
    
    public String TunjanganPendidikan(){
        if (pendidikan.equals("SMU") || pendidikan.equals("smu"))
            tunpen = 0.025 * gapok;
        else if (pendidikan.equals("D3") || pendidikan.equals("d3"))
            tunpen = 0.05 * gapok;
        else if (pendidikan.equals("S1") || pendidikan.equals("s1"))
            tunpen = 0.075* gapok;
        else 
            tunpen = 0;
        
        return pendidikan;
    }
    
    public int TunjanganHonor(){
        if (jamkerja > lamakerja){
            tunhonor = ((jamkerja-lamakerja)*2500);
        }else{
            tunhonor = 0;
        }
        return jamkerja;
    }
    
    public int HonorTerima(){
        return (int) (gapok+tunjab+tunpen+tunhonor);
    }
}