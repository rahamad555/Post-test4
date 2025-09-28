package service;

import java.util.ArrayList;
import java.util.List;
import model.Pulau;
import model.PulauBesar;
import model.PulauKecil;

public class PulauService {
    private final List<Pulau> daftarPulau = new ArrayList<>();
    private int counterId = 1;

    // === Tambah Pulau ===
    public void tambahPulau(int jenis, String nama, String lokasi, Double luas, Boolean berpenghuni) {
        Pulau pulau = null;

        switch (jenis) {
            case 1 -> // Pulau Biasa
                pulau = new Pulau(counterId++, nama, lokasi);

            case 2 -> // Pulau Besar
                pulau = new PulauBesar(counterId++, nama, lokasi, luas);

            case 3 -> // Pulau Kecil
                pulau = new PulauKecil(counterId++, nama, lokasi, berpenghuni);

            default -> {
                System.out.println("Jenis pulau tidak valid!");
                return;
            }
        }

        daftarPulau.add(pulau);
        System.out.println("Pulau berhasil ditambahkan!");
        pulau.tampilkanDeskripsi(); // <<< Polymorphism jalan di sini
    }

    // === Lihat Semua Pulau ===
    public void lihatDaftarPulau() {
        if (daftarPulau.isEmpty()) {
            System.out.println(" Daftar pulau masih kosong.");
            return;
        }

        System.out.println("===== DAFTAR PULAU =====");
        for (Pulau p : daftarPulau) {
            System.out.print(p.getId() + " | Nama: " + p.getNama() + " | Lokasi: " + p.getLokasi());

            switch (p) {
                case PulauBesar pb -> System.out.println(" | Jenis: Pulau Besar | Luas: " + pb.getLuas() + " km²");
                case PulauKecil pk -> System.out.println(" | Jenis: Pulau Kecil | Berpenghuni: " + (pk.isBerpenghuni() ? "Ya" : "Tidak"));
                default -> System.out.println(" | Jenis: Pulau Biasa");
            }
        }
    }

    // === Ubah Nama Pulau ===
    public void ubahNamaPulau(int id, String namaBaru) {
        for (Pulau p : daftarPulau) {
            if (p.getId() == id) {
                p.setNama(namaBaru);
                System.out.println("✅ Nama pulau berhasil diubah.");
                return;
            }
        }
        System.out.println("❌ Pulau dengan ID " + id + " tidak ditemukan.");
    }

    // === Ubah Lokasi Pulau ===
    public void ubahLokasiPulau(int id, String lokasiBaru) {
        for (Pulau p : daftarPulau) {
            if (p.getId() == id) {
                p.setLokasi(lokasiBaru);
                System.out.println("✅ Lokasi pulau berhasil diubah.");
                return;
            }
        }
        System.out.println("❌ Pulau dengan ID " + id + " tidak ditemukan.");
    }

    // === Hapus Pulau ===
    public void hapusPulau(int id) {
        Pulau target = null;
        for (Pulau p : daftarPulau) {
            if (p.getId() == id) {
                target = p;
                break;
            }
        }
        if (target != null) {
            daftarPulau.remove(target);
            System.out.println("✅ Pulau berhasil dihapus.");
        } else {
            System.out.println("❌ Pulau dengan ID " + id + " tidak ditemukan.");
        }
    }
}
