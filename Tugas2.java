import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int pendaftar, cabor;
        String namaPoltek, namaCabor, namaAtlet;
        
        System.out.print("Jumlah Politeknik yang mendaftar : ");
        pendaftar = sc.nextInt(); sc.nextLine();
        
        for (int i = 1; i <= pendaftar; i++) {
            System.out.print("Masukkan Nama Politeknik ke " + i + " : " );
            namaPoltek = sc.nextLine();
            System.out.print("Jumlah cabor yang diikuti : ");
            cabor = sc.nextInt(); sc.nextLine();
            System.out.println("\nNama Politeknik : " + namaPoltek);
            
            for (int j = 1; j <= cabor; j++) {
                System.out.print("\nMasukkan Nama Cabor ke " + j + " : ");
                namaCabor = sc.nextLine();
                System.out.println("Cabor : " + namaCabor);
                String totalAtlet = "";

                int k = 1;
                
                while (k <=5 ) {    
                    System.out.print("Nama Atlet ke " + k + " : ");
                    namaAtlet = sc.nextLine();
                    totalAtlet += namaAtlet + ",";
                    k++;
                }
                System.out.println();
                System.out.println("Nama para Atlet Cabang Orlahraga " + namaCabor + " : " + totalAtlet);
            }
            System.out.println();
        }
    }
}