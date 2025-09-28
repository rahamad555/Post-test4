package main;

import java.util.Scanner;
import service.PulauService;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PulauService service = new PulauService();

        while (true) {
            System.out.println("\n===== MENU DAFTAR PULAU INDONESIA =====");
            System.out.println("1. Tambah Pulau");
            System.out.println("2. Lihat Daftar Pulau");
            System.out.println("3. Ubah Nama Pulau");
            System.out.println("4. Ubah Lokasi Pulau");
            System.out.println("5. Hapus Pulau");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (menu) {
                case 1 -> {
                    System.out.println("\n=== Pilih Jenis Pulau ===");
                    System.out.println("1. Pulau Biasa");
                    System.out.println("2. Pulau Besar");
                    System.out.println("3. Pulau Kecil");
                    System.out.print("Pilih jenis: ");
                    int jenis = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Masukkan nama pulau: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan lokasi pulau: ");
                    String lokasi = scanner.nextLine();

                    Double luas = null;
                    Boolean berpenghuni = null;

                    if (jenis == 2) { // Pulau Besar
                        System.out.print("Masukkan luas pulau (km²): ");
                        luas = scanner.nextDouble();
                        scanner.nextLine();
                    } else if (jenis == 3) { // Pulau Kecil
                        System.out.print("Apakah pulau berpenghuni? (true/false): ");
                        berpenghuni = scanner.nextBoolean();
                        scanner.nextLine();
                    }

                    service.tambahPulau(jenis, nama, lokasi, luas, berpenghuni);
                }

                case 2 -> service.lihatDaftarPulau();

                case 3 -> {
                    System.out.print("Masukkan ID pulau yang ingin diubah namanya: ");
                    int idNama = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama baru: ");
                    String namaBaru = scanner.nextLine();
                    service.ubahNamaPulau(idNama, namaBaru);
                }

                case 4 -> {
                    System.out.print("Masukkan ID pulau yang ingin diubah lokasinya: ");
                    int idLokasi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan lokasi baru: ");
                    String lokasiBaru = scanner.nextLine();
                    service.ubahLokasiPulau(idLokasi, lokasiBaru);
                }

                case 5 -> {
                    System.out.print("Masukkan ID pulau yang ingin dihapus: ");
                    int idHapus = scanner.nextInt();
                    scanner.nextLine();
                    service.hapusPulau(idHapus);
                }

                case 6 -> {
                    System.out.println("Terima kasih! Program selesai.");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Menu tidak valid, coba lagi.");
            }
        }
    }
}
