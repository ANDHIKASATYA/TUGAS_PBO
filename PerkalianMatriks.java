import java.util.Scanner;
class PerkalianMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[][] matriks1;
        int[][] matriks2;
        int[][] hasil;
        int baris;
        int kolom;
        char pilih;
        do{
            System.out.println("=======PROGRAM PERKALIAN MATRIKS=======");
            System.out.print("Masukkan banyak baris matriks : ");
            baris = input.nextInt();
            System.out.print("Masukkan banyak kolom matriks : ");
            kolom = input.nextInt();
            System.out.println();

            matriks1 = new int[baris][kolom];
            matriks2 = new int[baris][kolom];
            hasil = new int[baris][kolom];

            System.out.println("Masukkan elemen matriks 1");
            for(int x=0; x<baris; x++){
                for(int y=0; y<kolom; y++){
                    System.out.print("Matriks1 ["+x+"]["+y+"] = ");
                    int isi = input.nextInt();
                    matriks1[x][y] = isi;
                }
            }
            System.out.println("\n");

            System.out.println("Masukkan elemen matriks 2");
            for(int x=0; x<baris; x++){
                for(int y=0; y<kolom; y++){
                    System.out.print("Matriks2 ["+x+"]["+y+"] = ");
                    int isi = input.nextInt();
                    matriks2[x][y] = isi;
                }
            }
            System.out.println("Hasil perkalian matriks: ");
            for(int x = 0; x<baris; x++){
                for(int y = 0; y<kolom; y++){
                    hasil[x][y] = matriks1[x][y] * matriks2[x][y];
                    System.out.print(hasil[x][y]+"  ");
                }
            }
            System.out.println();
            System.out.println("=======================================");
            System.out.print("Apakah anda ingin mengulang program Y/N : ");
            pilih = input.next().charAt(0);

            if(pilih == 'N'){
                System.out.println("Anda telah keluar dari program");
            }
        }while(pilih == 'Y');
    }
}