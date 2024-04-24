package studies.maratonajava.javacore.Ycolections.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String name;
    private Double price;

    public Manga(Long id, String name, double price) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Manga manga = (Manga) object;
        return Double.compare(price, manga.price) == 0 && Objects.equals(id, manga.id) && Objects.equals(name, manga.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // -1 if this < manga
    // if this == manga return 0
    // if this > manga return 1
    @Override
    public int compareTo(Manga manga) {
        return this.id.compareTo(manga.getId());
//        return this.price.compareTo(manga.getPrice());
//        return this.name.compareTo(manga.getName());
    }
}
