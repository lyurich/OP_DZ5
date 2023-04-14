package Sem5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        ArrayList<Telefon> listTelefon = new ArrayList<>();
        shop.create(listTelefon);

        for (Telefon temp: listTelefon) {
            System.out.println(temp.toString());
        }
        System.out.println("----------------------------------------------------------------------------------------");
        shop.sell(listTelefon);

        for (Telefon temp: listTelefon) {
            System.out.println(temp.toString());
        }
    }
}
