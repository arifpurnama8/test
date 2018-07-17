package bab5;
public class AksiInputData {
    public static void main(String[] args) {
        InputData scan = new InputData();
        
        System.out.println("Program Hitung Honor Karyawan Kontrak");
        System.out.println("PT. DIngin Damai");
        scan.setInputData();
        scan.TunjanganJabatan();
        scan.TunjanganPendidikan();
        scan.TunjanganHonor();
        scan.HonorTerima();
        System.out.println("\n------------------------");       
        System.out.println("Nama Karyawan           : "+scan.namakaryawan);
        System.out.println("Honor yang di terima ");
        System.out.println("Honor Tetap             : "+scan.gapok);
        System.out.println("Tunjangan Jabatan       : "+scan.tunjab);
        System.out.println("Tunjangan Pendidikan    : "+scan.tunpen);
        System.out.println("Honor Lembur            : "+scan.tunhonor);
        System.out.println("=========================+");
        System.out.println("Honor Yang Diterima     : "+scan.HonorTerima());
    }
}
