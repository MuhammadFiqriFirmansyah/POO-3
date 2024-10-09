# POO -3

## Latihan 2
![img](Screenshot/latihan2.png)

### kode main
```java
public class Main {
    public static void main(String[] args) {
        // Membuat objek Person
        Person anton = new Person("Anton", "Laki-laki", 25);
        Person riko = new Person("Riko", "Laki-laki", 30);

        // Menampilkan informasi Person
        System.out.println("Informasi Anton:");
        anton.tampilkanInformasi();

        System.out.println("\nInformasi Riko:");
        riko.tampilkanInformasi();
    }
}
```
###  kode Person
``` java

public class Person {
    // Atribut
    private String nama;
    private String jenisKelamin;
    private int umur;

    // Konstruktor
    public Person(String nama, String jenisKelamin, int umur) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Method untuk menampilkan informasi Person
    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur: " + umur);
    }
}
```
