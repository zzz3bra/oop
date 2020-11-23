package by.tms.examples.oop.inheritance;

import java.util.Date;
import java.util.StringJoiner;

public class SmallBeresta implements Paper {
    private String text = "олдскул";
    private boolean burnt = false;
    private Date date = new Date();

    public SmallBeresta(SmallBeresta that) { // copy constructor
        this.text = that.text;//copy reference of immutable class
        this.date = new Date(that.date.getTime());//copy constructor usage for mutable class
        this.burnt = that.burnt;
    }

    public SmallBeresta() {
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Inside finalize method of "
                + getClass().getSimpleName() + " at " + System.currentTimeMillis());
    }

    @Override
    public String read() {
        return text;
    }

    @Override
    public void write(String text) {
        this.text = text;
    }

    @Override
    public void burn() {
        if (!burnt) {
            System.out.println("Я горю и лапти тоже");
            burnt = true;
        } else {
            System.out.println("Тихо тлею неспеша");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //reference check
        if (!(o instanceof SmallBeresta)) return false; // breaks symmetry

        SmallBeresta that = (SmallBeresta) o;

        if (burnt != that.burnt) return false;
        return text != null ? text.equals(that.text) : that.text == null;
    }

    @Override
    public int hashCode() {
        int result = text != null ? text.hashCode() : 0;
        result = 31 * result + (burnt ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SmallBeresta.class.getSimpleName() + "[", "]")
                .add("text='" + text + "'")
                .add("burnt=" + burnt)
                .toString();
    }
}
