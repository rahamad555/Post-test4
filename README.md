# Post-test4

Rahmad Ramdhan|2409116018|Sistem Informasi|A'2024|Tema Program:Sistem Manajemen Daftar Pulau Di Indonesia

# Deskripsi Pemrograman

Program ini adalah aplikasi sederhana berbasis Java yang digunakan untuk mencatat daftar pulau di Indonesia. Di dalamnya, pengguna dapat menambah pulau baru, melihat daftar pulau yang ada, mengubah nama pulau, dan juga menghapus pulau dari daftar. Program dibuat dengan ArrayList agar data dapat ditambah atau dihapus dengan mudah, serta menggunakan menu interaktif yang akan terus muncul sampai pengguna memilih keluar. Singkatnya, program ini mirip catatan digital sederhana yang bisa dikelola langsung melalui terminal.

# Menu Utama

Pada menu utama, pengguna akan diberikan 6 pilihan dan pengguna diminta untuk menginputkan angka sesuai pilihan yang telah disediakan.


<img width="425" height="186" alt="Screenshot 2025-09-15 114742" src="https://github.com/user-attachments/assets/d011735e-6bf6-4ac1-ace9-bf1bd6f95b10" />

Jika pengguna menginputkan pilihan angka yang tidak disediakan, maka akan muncul pesan seperti gambar dibawah dan program otomatis akan diulang di bagian menu utama.


<img width="391" height="196" alt="Screenshot 2025-09-15 114917" src="https://github.com/user-attachments/assets/381c82cb-0685-43ca-9f80-492408617212" />



# Penjelasan Menu Utama



<img width="425" height="186" alt="Screenshot 2025-09-15 114742" src="https://github.com/user-attachments/assets/e72b0392-e95e-41b9-98cc-80b5d6f5ac26" />


[1.] Jika pilih menu 1 (Tambah Pulau)


Pada output tambah pulau, program pertama menampilkan menu utama, lalu pengguna memilih opsi tambah pulau. Setelah itu muncul pilihan jenis pulau yaitu Pulau Biasa, Pulau Besar, dan Pulau Kecil. Jika pengguna memilih Pulau Kecil, maka program akan meminta input berupa nama pulau, lokasi pulau, serta pulau tersebut berpenduduk atau tidak. Semua data yang dimasukkan akan disimpan ke dalam daftar menggunakan struktur ArrayList, kemudian program memberikan konfirmasi bahwa data berhasil ditambahkan. Dengan cara ini, setiap jenis pulau dapat disimpan dengan atribut sesuai kebutuhannya, misalnya Pulau Kecil menyimpan informasi tambahan berupa  pulau tersebut berpenduduk atau tidak.



<img width="478" height="398" alt="Screenshot 2025-09-23 183111" src="https://github.com/user-attachments/assets/b8684736-2c39-4885-b14c-5f6bde00bb6a" />


[2.] Jika pilih menu 2 (Lihat Daftar Pulau)

Pada output lihat daftar pulau, program menampilkan seluruh data pulau yang sudah tersimpan dalam daftar. Setiap entri ditampilkan dengan format yang rapi, menampilkan nomor urut, nama pulau, lokasi, dan jenis pulau. Jika pulau tersebut memiliki atribut khusus, seperti luas pada Pulau Besar atau jumlah penduduk pada Pulau Kecil, informasi tersebut juga ikut ditampilkan secara otomatis. Selain itu, agar lebih fleksibel, program memberikan pilihan tambahan kepada pengguna untuk menampilkan daftar pulau berdasarkan jenis tertentu.


<img width="843" height="420" alt="Screenshot 2025-09-23 183405" src="https://github.com/user-attachments/assets/998f60c1-399c-49df-b3be-2287d0305f3d" />


[3.]Jika pilih menu 3 (Ubah Nama Pulau)


<img width="448" height="243" alt="Screenshot 2025-09-15 120443" src="https://github.com/user-attachments/assets/ec792d11-7e25-4c36-980c-f6aabb8fa75e" />

Penjelasan:Tampilan awal jika user memilih no 3(ubah nama pulau) user akan di minta untuk mengisi ID pulau yang ingin di ubah namanya,setelah ganti nama pulau yang awal nya Kalimantan Timur di ubah menjadi Jawa timur.

[4.]Jika pilih no 4(ubah lokasi pulau)


<img width="431" height="240" alt="Screenshot 2025-09-15 121341" src="https://github.com/user-attachments/assets/acf4082c-e1c2-4a95-a233-bc153d619607" />

Penjelasan:kalau di menu no 3 kita mengubah nama pulau,nah kalau di menu no 4 ini mengubah lokasinya,yang awalnya Indonesia Tengah menjadi Indonesia Barat.



[5.]Jika pilih menu 5 (Hapus pulau)



<img width="425" height="231" alt="Screenshot 2025-09-15 121843" src="https://github.com/user-attachments/assets/e99bdfd3-a7c0-4a22-b6b1-9dada6eedbf6" />


Penjelasan:User di arahkan untuk mengisi ID(no pulau) yang ingin di hapus.


[6.]Jika pilih menu 6(keluar)


<img width="685" height="318" alt="Screenshot 2025-09-15 122415" src="https://github.com/user-attachments/assets/ac7bf5d8-a4f0-4128-b226-19bd3233fb95" />

Penjelasan:Program berhenti berjalan karena pengguna sudah memilih keluar.


# Penjelasan Abstraction
Dalam program ini, abstraction diterapkan melalui interface DeskripsiPulau yang ada di package model. Interface ini mendefinisikan method abstrak tampilkanDeskripsi() yang wajib diimplementasikan oleh setiap subclass dari Pulau. Dengan adanya abstraction, kita bisa memastikan semua jenis pulau (Pulau Biasa, Pulau Besar, Pulau Kecil) memiliki cara sendiri untuk menampilkan deskripsinya, meskipun detail implementasinya berbeda-beda. Abstraction ini membuat kode lebih terstruktur, karena kelas turunan hanya perlu fokus pada bagaimana deskripsi masing-masing pulau ditampilkan sesuai karakteristiknya.

# Penjelasan Polymorphism

Polymorphism diimplementasikan dalam dua bentuk, yaitu Overriding dan Overloading.

* Overriding terjadi ketika subclass (PulauBesar, PulauKecil) meng-override method tampilkanDeskripsi() dari interface DeskripsiPulau. Hasilnya, meskipun semua pulau dipanggil dengan method yang sama (tampilkanDeskripsi()), output yang muncul akan berbeda. Contohnya, Pulau Besar menampilkan atribut tambahan berupa luas wilayah, sedangkan Pulau Kecil menampilkan atribut status berpenghuni.

* Overloading terjadi pada bagian PulauService, khususnya pada method tambahPulau(). Method ini dibuat dalam beberapa versi (dengan parameter berbeda), misalnya ada yang menerima hanya nama dan lokasi (untuk Pulau Biasa), ada yang menerima nama, lokasi, dan luas (untuk Pulau Besar), serta ada yang menerima nama, lokasi, dan status berpenghuni (untuk Pulau Kecil). Dengan cara ini, nama method tetap sama tetapi bisa dipanggil sesuai kebutuhan jenis pulau yang ingin ditambahkan.


# Contoh Output


  <img width="704" height="340" alt="image" src="https://github.com/user-attachments/assets/391efcdd-7e67-4c02-909e-8e451c08ca42" />


Pada output tersebut, program pertama menampilkan menu utama dan pengguna memilih opsi tambah pulau. Setelah itu, sistem menampilkan daftar jenis pulau yang dapat dipilih, yaitu Pulau Biasa, Pulau Besar, dan Pulau Kecil. Pengguna memilih Pulau Biasa, lalu program meminta masukan berupa nama dan lokasi pulau. Dalam contoh ini, pengguna memasukkan nama Belitung dengan lokasi Kepulauan Bangka Belitung. Setelah data berhasil disimpan, program secara otomatis menampilkan deskripsi khusus dari Pulau Biasa.

Penerapan konsep abstraction terlihat dari penggunaan interface DeskripsiPulau yang mendefinisikan method tampilkanDeskripsi(). Sementara itu, konsep polymorphism (overriding) ditunjukkan ketika class Pulau Biasa mengimplementasikan method tampilkanDeskripsi() dengan isi berbeda, yakni menjelaskan bahwa pulau biasa berukuran sedang dan umumnya dihuni oleh masyarakat lokal. Dengan cara ini, meskipun semua jenis pulau menggunakan method yang sama, hasil deskripsi yang ditampilkan berbeda sesuai dengan karakteristik masing-masing jenis pulau.



<img width="691" height="369" alt="image" src="https://github.com/user-attachments/assets/94a28c7c-4026-49dd-8d85-86abd1e09e7f" />


Pada output ini, program menampilkan menu utama dan pengguna memilih opsi Tambah Pulau. Setelah itu muncul daftar jenis pulau, lalu pengguna memilih Pulau Besar. Program kemudian meminta masukan berupa nama pulau, lokasi pulau, serta luas pulau dalam satuan km². Pada contoh ini, pengguna memasukkan nama Kalimantan Timur, lokasi Indonesia Tengah, dan luas 139462 km². Setelah data berhasil dimasukkan ke dalam daftar, program menampilkan deskripsi khusus untuk Pulau Besar.

Konsep abstraction diterapkan melalui penggunaan interface DeskripsiPulau yang memastikan semua jenis pulau wajib memiliki method tampilkanDeskripsi(). Sementara itu, konsep polymorphism (overriding) muncul karena class PulauBesar mengimplementasikan method tampilkanDeskripsi() dengan isi yang berbeda dari Pulau Biasa maupun Pulau Kecil. Pada Pulau Besar, deskripsi lebih menekankan bahwa pulau dengan ukuran luas ini biasanya menjadi pusat aktivitas ekonomi, pemerintahan, dan budaya. Dengan demikian, meskipun semua jenis pulau menggunakan method yang sama, hasil output yang diberikan dapat berbeda sesuai karakteristiknya.




<img width="853" height="379" alt="image" src="https://github.com/user-attachments/assets/210bb129-120a-4c43-a540-c3a8cbcf8bf7" />


Pada output ini, setelah pengguna memilih menu Tambah Pulau, program menampilkan pilihan jenis pulau. Pengguna memilih Pulau Kecil, sehingga sistem meminta input berupa nama pulau, lokasi, serta status berpenghuni atau tidak. Pada contoh ini, pengguna mengisi nama Derawan, lokasi Berau, dan status berpenghuni: true. Data tersebut berhasil ditambahkan ke dalam daftar dan program menampilkan deskripsi khusus untuk Pulau Kecil.

Konsep abstraction diterapkan melalui interface DeskripsiPulau, yang mewajibkan setiap jenis pulau untuk menampilkan deskripsi dengan cara masing-masing. Sedangkan konsep polymorphism (overriding) terlihat karena method tampilkanDeskripsi() di class PulauKecil memberikan detail berbeda dibandingkan Pulau Biasa atau Pulau Besar. Pada Pulau Kecil, deskripsi menekankan bahwa pulau ini biasanya digunakan untuk pariwisata, tempat tinggal nelayan, atau kawasan konservasi, serta menambahkan atribut tambahan status berpenghuni untuk membedakan karakteristiknya. Dengan demikian, meskipun method yang dipanggil sama, hasil deskripsinya lebih sesuai dengan sifat khas Pulau Kecil.






























































