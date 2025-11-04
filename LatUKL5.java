import java.util.Scanner;

public class LatUKL5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rekap Nilai Ujian Siswa");

        int jumlahSiswa;
        do {
            System.out.print("Masukkan jumlah siswa: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Input harus bilangan bulat.");
                scanner.next(); 
                System.out.print("Masukkan jumlah siswa: ");
            }
            jumlahSiswa = scanner.nextInt();
            if (jumlahSiswa <= 0) {
                System.out.println("Jumlah siswa harus lebih dari nol.");
            }
        } while (jumlahSiswa <= 0);

        double[] nilaiSiswa = new double[jumlahSiswa];
        double totalNilai = 0;

        for (int i = 0; i < jumlahSiswa; i++) {
            double nilai;
            do {
                System.out.print("Masukkan nilai ujian siswa ke-" + (i + 1) + " (0-100): ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Input harus berupa angka.");
                    scanner.next();
                    System.out.print("Masukkan nilai ujian siswa ke-" + (i + 1) + " (0-100): ");
                }
                nilai = scanner.nextDouble();
                if (nilai < 0 || nilai > 100) {
                    System.out.println("Nilai harus berada dalam rentang 0 sampai 100.");
                }
            } while (nilai < 0 || nilai > 100);

            nilaiSiswa[i] = nilai;
            totalNilai += nilai;
        }

        double rataRata = totalNilai / jumlahSiswa;

        System.out.println("\nHasil Rekap");
        System.out.printf("Nilai Rata-rata Ujian dari %d siswa adalah: %.2f\n", jumlahSiswa, rataRata);

    }
}