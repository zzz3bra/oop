package by.tms.examples.oop.inheritance;

public class InterfaceExample {
    public static void main(String[] args) {
        SmallBeresta smallBeresta = new SmallBeresta();
        CellulosePaper cellulosePaper = new CellulosePaper();
        AsbestPaper asbestPaper = new AsbestPaper();

        printAll(smallBeresta, cellulosePaper, asbestPaper);
        System.out.println();
        fireplace(smallBeresta, cellulosePaper);
    }

    public static void fireplace(Paper... papers) {
        for (int i = 0; i < papers.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(papers[i].read());
                papers[i].write(null);
                papers[i].burn();
            }
        }
    }

    public static void printAll(Readable... papers) {
        for (int i = 0; i < papers.length; i++) {
            System.out.println(papers[i].read());
        }
    }
}
