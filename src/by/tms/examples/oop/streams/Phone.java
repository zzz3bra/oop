package by.tms.examples.oop.streams;

import java.util.List;
import java.util.StringJoiner;

public class Phone {
    private List<String> color;
    private String name;
    private int price;

    public Phone(String name, int price, String... color) {
        this.name = name;
        this.price = price;
        this.color = List.of(color);
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (price != phone.price) return false;
        if (color != null ? !color.equals(phone.color) : phone.color != null) return false;
        return name != null ? name.equals(phone.name) : phone.name == null;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Phone.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("price=" + price)
                .toString();
    }
}
