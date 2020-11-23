package by.tms.examples.oop.inheritance;

public class SmallBeresta implements Paper {
    private String text = "олдскул";
    private boolean burnt = false;

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
}
