//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//Soal Nomor 1
    int StrukturBaris = 10;
    System.out.println ("Soal Nomor 1");
    System.out.println(StrukturBaris);

//Soal Nomor 2
    String KataBaru = "Lufty";
    System.out.println ("\nSoal Nomor 2");
    System.out.println(KataBaru);

//Soal Nomor 3
    //NIM = 059767807
    int[] NIM = {05, 10, 20, 07};

    System.out.print("\nSoal 3 - NIM: ");
    for (int i = 0; i < NIM.length; i++) {
        System.out.print(NIM[i] + " ");
    }
    System.out.println();

//Soal Nomor 4
    String[][] Angka = {
            {"05", "3", "5"},
            {"14", "19", "20"},
            {"22", "27", "07"},
    };
    System.out.println("\n\nSoal 4 - Angka:");
    for (int baris = 0; baris < Angka.length; baris++) {
        for (int kolom = 0; kolom < Angka[baris].length; kolom++) {
            System.out.print(Angka[baris][kolom] + " ");
        }
        System.out.println();}

//Soal Nomor 5
    LinkedList<Integer> listAngka = new LinkedList<Integer>();
    listAngka.push(05);
    listAngka.push(19);
    listAngka.push(44);
    listAngka.push(60);
    listAngka.push(07);
    System.out.println("\n\nSoal 5 - listAngka: " + listAngka);
}