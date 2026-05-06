package Entities;

public class Magazine extends LibraryItem{
    String magazinePublisher;

    public String getMagazinePublisher() {
        return magazinePublisher;
    }

    public void setMagazinePublisher(String magazinePublisher) {
        this.magazinePublisher = magazinePublisher;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "magazinePublisher='" + magazinePublisher + '\'' +
                '}';
    }
}