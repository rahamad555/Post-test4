package model;

public class Pulau implements DeskripsiPulau {
    private final int id;
    private String nama;
    private String lokasi;

    public Pulau(int id, String nama, String lokasi) {
        this.id = id;
        this.nama = nama;
        this.lokasi = lokasi;
    }

    // Getter & Setter
    public int getId() { return id; }
    public String getNama() { return nama; }
    public String getLokasi() { return lokasi; }

    public void setNama(String nama) { this.nama = nama; }
    public void setLokasi(String lokasi) { this.lokasi = lokasi; }

    // Implementasi dari interface (Polymorphism Override)
    @Override
    public void tampilkanDeskripsi() {
        System.out.println("--- Deskripsi Pulau ---");
        System.out.println("Nama Pulau : " + nama);
        System.out.println("Lokasi     : " + lokasi);
        System.out.println("Jenis      : Pulau Biasa");
        System.out.println("Catatan    : Pulau biasa memiliki ukuran sedang dan umumnya dihuni oleh masyarakat lokal.");
    }
}
