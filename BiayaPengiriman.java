import java.util.Scanner;

public class BiayaPengiriman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak pengiriman (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        // Hitung volume
        double volume = panjang * lebar * tinggi;

        // Tentukan biaya per kg
        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        // Hitung biaya berdasarkan berat
        double biayaBerat = berat * biayaPerKg;

        // Hitung biaya volume jika melebihi 100 cm^3
        double biayaVolume = 0;
        if (volume > 100) {
            biayaVolume = 50000;
        }

        // Total biaya
        double totalBiaya = biayaBerat + biayaVolume;

        System.out.println("\n===== RINCIAN BIAYA =====");
        System.out.println("Volume paket: " + volume + " cm^3");
        System.out.println("Biaya berdasarkan berat: Rp " + biayaBerat);
        System.out.println("Biaya tambahan volume: Rp " + biayaVolume);
        System.out.println("Total biaya pengiriman: Rp " + totalBiaya);

        input.close();
    }
}
