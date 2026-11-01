
import java.util.Arrays;

public class Main {

    // ALGORITMA MERGE SORT
    static void mergeSort(int[] data, int kiri, int kanan) {
        if (kiri < kanan) {
            int tengah = kiri + (kanan - kiri) / 2;

            mergeSort(data, kiri, tengah);
            mergeSort(data, tengah + 1, kanan);

            merge(data, kiri, tengah, kanan);
        }
    }

    static void merge(int[] data, int kiri, int tengah, int kanan) {
        int n1 = tengah - kiri + 1;
        int n2 = kanan - tengah;

        int[] kiriData = new int[n1];
        int[] kananData = new int[n2];

        for (int i = 0; i < n1; i++) {
            kiriData[i] = data[kiri + i];
        }

        for (int j = 0; j < n2; j++) {
            kananData[j] = data[tengah + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = kiri;

        // Urutkan dari terbesar ke terkecil
        while (i < n1 && j < n2) {
            if (kiriData[i] >= kananData[j]) {
                data[k++] = kiriData[i++];
            } else {
                data[k++] = kananData[j++];
            }
        }

        while (i < n1) {
            data[k++] = kiriData[i++];
        }

        while (j < n2) {
            data[k++] = kananData[j++];
        }
    }

    // ALGORITMA COUNTING SORT
    static void countingSort(int[] data) {
        if (data.length == 0) {
            return;
        }

        int minimum = data[0];
        int maksimum = data[0];

        for (int nilai : data) {
            if (nilai < minimum) {
                minimum = nilai;
            }

            if (nilai > maksimum) {
                maksimum = nilai;
            }
        }

        int[] frekuensi = new int[maksimum - minimum + 1];

        for (int nilai : data) {
            frekuensi[nilai - minimum]++;
        }

        int indeks = 0;

        // Susun dari nilai maksimum ke minimum
        for (int nilai = maksimum; nilai >= minimum; nilai--) {
            while (frekuensi[nilai - minimum] > 0) {
                data[indeks++] = nilai;
                frekuensi[nilai - minimum]--;
            }
        }
    }

    // PROGRAM UTAMA
    public static void main(String[] args) {

        int a1 = 45;
        int a2 = 12;
        int a3 = 78;
        int a4 = 23;
        int a5 = 56;
        int a6 = 9;
        int a7 = 34;
        int a8 = 67;

        int[] dataAwal = {
                a1, a2, a3, a4, a5, a6, a7, a8
        };

        // Salinan agar kedua algoritma memakai data awal yang sama
        int[] dataMerge = dataAwal.clone();
        int[] dataCounting = dataAwal.clone();

        System.out.println("==================================");
        System.out.println("   PROGRAM PERBANDINGAN SORTING");
        System.out.println("==================================");

        System.out.println("\nData awal:");
        System.out.println(Arrays.toString(dataAwal));

        // Proses Merge Sort
        mergeSort(dataMerge, 0, dataMerge.length - 1);

        System.out.println("\nHasil Merge Sort (Descending):");
        System.out.println(Arrays.toString(dataMerge));

        // Proses Counting Sort
        countingSort(dataCounting);

        System.out.println("\nHasil Counting Sort (Descending):");
        System.out.println(Arrays.toString(dataCounting));

        // Membandingkan hasil kedua algoritma
        System.out.println("\nApakah hasil kedua algoritma sama?");
        System.out.println(Arrays.equals(dataMerge, dataCounting));
    }
}
