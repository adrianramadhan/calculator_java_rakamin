class Laptop {
    String hidupkanLaptop(String pemilik, String merk) {
        return "Hidupkan Laptop " + merk + " milik " + pemilik;
    }

    String matikanLaptop(String pemilik, String merk) {
        return "Matikan Laptop " + merk + " milik " + pemilik;
    }

    void restartLaptop() {
        System.out.println(matikanLaptop("Adrian", "ASUS"));
        System.out.println(hidupkanLaptop("Adrian", "ASUS"));
    }
}

public class Main {
    public static void main(String[] args) {
        Laptop laptopAdrian = new Laptop();
        laptopAdrian.restartLaptop();
    }
}