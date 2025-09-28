package model;

public class PulauBesar extends Pulau {
    private double luas;

    public PulauBesar(int id, String nama, String lokasi, double luas) {
        super(id, nama, lokasi);
        this.luas = luas;
    }

    public double getLuas() { return luas; }
    public void setLuas(double luas) { this.luas = luas; }

    // Override polymorphism
    @Override
    public void tampilkanDeskripsi() {
        System.out.println("--- Deskripsi Pulau Besar ---");
        System.out.println("Nama Pulau : " + getNama());
        System.out.println("Lokasi     : " + getLokasi());
        System.out.println("Jenis      : Pulau Besar");
        System.out.println("Luas       : " + luas + " km²");
        System.out.println("Catatan    : Pulau besar biasanya menjadi pusat aktivitas ekonomi, pemerintahan, dan budaya.");
    }
}
