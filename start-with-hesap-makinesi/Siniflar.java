public class Siniflar {
    public static void main(String[] args) {
        // OOP giriş
        // SınıfAdı ObjeAdı = new SınıfAdı();

        HesapMakinesi makine1 = new HesapMakinesi(3, 5, "");
        // System.out.println(makine1.sayi2);

        HesapMakinesi makine2 = new HesapMakinesi(2, 4, "");
        makine1.sayi1 = 50;
        makine2.sayi2 = 60;
        // System.out.println(makine2.sayi2 + " " + makine1.sayi1);

        int toplam = makine1.toplama();
        // System.out.println(toplam);

        int toplam2 = makine2.toplama();
        // System.out.println(toplam2);

        HesapMakinesi makine3 = new HesapMakinesi(toplam, toplam2, "Deniz Karakaş");
        System.out.println(makine3.name + " ın makinesi  " + makine3.sayi1);

    }
}