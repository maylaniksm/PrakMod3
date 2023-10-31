/**
 * Kelas Persegi digunakan untuk menghitung luas dari sebuah persegi.
 */
public class Persegi {
    /**
     * Metode ini menghitung luas dari sebuah persegi.
     *
     * @param sisi Panjang sisi persegi.
     * @return Luas dari persegi.
     */

    public double hitungLuas(double sisi) {
        // Menghitung luas persegi dengan rumus sisi * sisi
        return sisi * sisi;
    }

    /**
     * Metode utama untuk menguji kelas Persegi.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam contoh ini).
     */
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        double sisi = 5.0;
        double luas = persegi.hitungLuas(sisi);
        System.out.println("Luas persegi dengan sisi " + sisi + " adalah " + luas);
    }
}
