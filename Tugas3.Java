import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ARRAY GAJI UNTUK GOLONGAN A, B, C
        long[] gajiGolongan = {5000000, 6500000, 9500000};

        // ARRAY PERSEN LEMBUR (index 0 = 30%, index 1 = 32%, dst.)
        double[] persenLembur = {0.30, 0.32, 0.34, 0.36, 0.38};

        String golongan;
        int indexGolongan = -1;
        int jamLembur;

        System.out.println("=== Program Perhitungan Gaji Karyawan Menggunakan ARRAY ===");

        // INPUT GOLONGAN
        System.out.print("Masukkan Golongan (A / B / C): ");
        golongan = input.nextLine().toUpperCase();

        // MENCARI INDEX GOLONGAN
        if (golongan.equals("A")) {
            indexGolongan = 0;
        } else if (golongan.equals("B")) {
            indexGolongan = 1;
        } else if (golongan.equals("C")) {
            indexGolongan = 2;
        } else {
            System.out.println("Golongan tidak valid!");
            return; // hentikan program
        }

        // MENGAMBIL GAJI POKOK DARI ARRAY
        long gajiPokok = gajiGolongan[indexGolongan];

        // INPUT JAM LEMBUR
        System.out.print("Masukkan Jam Lembur: ");
        jamLembur = input.nextInt();

        double persen;
        if (jamLembur == 1) {
            persen = persenLembur[0];
        } else if (jamLembur == 2) {
            persen = persenLembur[1];
        } else if (jamLembur == 3) {
            persen = persenLembur[2];
        } else if (jamLembur == 4) {
            persen = persenLembur[3];
        } else if (jamLembur >= 5) {
            persen = persenLembur[4];
        } else {
            persen = 0;
        }

        // HITUNG GAJI LEMBUR
        long gajiLembur = (long) (gajiPokok * persen);

        // HITUNG TOTAL GAJI
        long total = gajiPokok + gajiLembur;

        // OUTPUT
        System.out.println("\n=== RINCIAN GAJI KARYAWAN ===");
        System.out.println("Golongan            : " + golongan);
        System.out.println("Gaji Pokok          : Rp " + gajiPokok);
        System.out.println("Jam Lembur          : " + jamLembur + " Jam");
        System.out.println("Persentase Lembur   : " + (persen * 100) + " %");
        System.out.println("Gaji Lembur         : Rp " + gajiLembur);
        System.out.println("----------------------------------");
        System.out.println("Total Penghasilan   : Rp " + total);
    }
}
