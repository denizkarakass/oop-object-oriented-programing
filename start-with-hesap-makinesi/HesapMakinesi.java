public class HesapMakinesi {
    public int sayi1;
    public int sayi2;
    private int sayi3; // private dışarı çıkmaz
    public String name;

    HesapMakinesi(int sayi1, int sayi2, String name) {
        this.sayi1 = sayi1; // this burada class'ın scope undaki sayi1'i alır 2.satırdakini
        this.sayi2 = sayi2;
        this.name = name;
    }

    public int toplama() {
        return this.sayi1 + this.sayi2;
    }

}