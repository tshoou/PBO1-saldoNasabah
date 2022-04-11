
package menghitungluasoop;
import java.util.Scanner;
public class MenghitungLuasOOP {
    static int pilih;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        int pilih = scan.nextInt();
        switch(pilih){
            case 1:
                int sisi = scan.nextInt();
                
                System.out.println(luas(sisi));
            break;
            case 2:
                int alas = scan.nextInt();
                int tinggi = scan.nextInt();
   
                System.out.println(luas(alas, tinggi));
            break;
            case 3:
                int jari2 = scan.nextInt();
                
                System.out.println(luasLingkaran(jari2));
            break;
            default :
                System.out.println("Input yang anda masukan tidak sesuai");
            break;
        }
    }
    public static int luas(int sisi){

        return sisi*sisi;
    }
    public static int luas(int alas, int tinggi){
        int luasSegitiga = (alas*tinggi)/2;
        return luasSegitiga;
    }
    public static double luasLingkaran(int jari2){
        double luasLingkaran;
                if(jari2%7==0){
                    luasLingkaran = 22/7*jari2*jari2;
                }else {
                    luasLingkaran = 3.14*jari2*jari2;
                }
        return (double)(int)luasLingkaran;
    }
}

        
        