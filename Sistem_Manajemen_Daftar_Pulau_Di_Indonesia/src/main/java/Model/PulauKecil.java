package model;

public class PulauKecil extends Pulau {
    private boolean berpenghuni;

    public PulauKecil(int id, String nama, String lokasi, boolean berpenghuni) {
        super(id, nama, lokasi);
        this.berpenghuni = berpenghuni;
    }

    public boolean isBerpenghuni() { return berpenghuni; }
    public void setBerpenghuni(boolean berpenghuni) { this.berpenghuni = berpenghuni; }

    // Override polymorphism
    @Override
    public void tampilkanDeskripsi() {
        System.out.println("--- Deskripsi Pulau Kecil ---");
        System.out.println("Nama Pulau : " + getNama());
        System.out.println("Lokasi     : " + getLokasi());
        System.out.println("Jenis      : Pulau Kecil");
        System.out.println("Berpenghuni: " + (berpenghuni ? "Ya" : "Tidak"));
        System.out.println("Catatan    : Pulau kecil biasanya digunakan untuk pariwisata, tempat tinggal nelayan, atau kawasan konservasi.");
    }
}
