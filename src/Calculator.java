import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {


        String[] dersler = {"Matematik", "Fizik", "Kimya", "Türkçe", "Tarih", "Müzik"};
        int[] notlar = {0,0,0,0,0,0};
        int toplam=0;
        float ortalama=0;
        String yazi;

        Scanner scanner=new Scanner(System.in);

        for (int i=0;i< dersler.length;i++){
            while (true) {
                System.out.println(dersler[i] + " notunuz:");
                notlar[i] = scanner.nextInt();
                if(notlar[i]<=100&&notlar[i]>=0) {
                    toplam = toplam + notlar[i];
                    break;
                }
                else{
                    System.out.println("Lütfen 0-100 arası geçerli bir not giriniz.");
                }
            }
        }

        ortalama=toplam/ (float)dersler.length;

        System.out.println(ortalama);

        if(ortalama>=55){
            yazi="Sınıfı geçtiniz";
        }
        else{
            yazi="Sınıfta kaldınız";
        }
        System.out.println(yazi);
    }
}
