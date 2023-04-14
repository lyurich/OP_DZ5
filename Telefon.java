package Sem5;

import java.util.Objects;

public class Telefon {

    private String nameFactory;
    private String model;
    private double sizeDisplay;
    private String typeOS;
    private int akb;
    private double price;

    public Telefon() {
    }

    public Telefon(String nameFactory, String model, double sizeDisplay, int akb, String typeOS, double price) {
        this.nameFactory = nameFactory;
        this.model = model;
        this.sizeDisplay = sizeDisplay;
        this.typeOS = typeOS;
        this.akb = akb;
        this.price = price;
    }

    public String getNameFactory() {
        return nameFactory;
    }

    public String getModel() {
        return model;
    }

    public double getSizeDisplay() {
        return sizeDisplay;
    }

    public String getTypeOS() {
        return typeOS;
    }

    public int getAkb() {
        return akb;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefon telefon = (Telefon) o;
        return Double.compare(telefon.sizeDisplay, sizeDisplay) == 0 && akb == telefon.akb && Double.compare(telefon.price, price) == 0 && Objects.equals(nameFactory, telefon.nameFactory) && Objects.equals(model, telefon.model) && Objects.equals(typeOS, telefon.typeOS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFactory, model, sizeDisplay, typeOS, akb, price);
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "nameFactory='" + nameFactory + '\'' +
                ", model='" + model + '\'' +
                ", sizeDisplay=" + sizeDisplay +
                ", typeOS='" + typeOS + '\'' +
                ", akb=" + akb +
                ", price=" + price +
                '}';
    }


}
