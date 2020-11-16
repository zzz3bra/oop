package by.tms.examples.oop.simple;

public class EnclosingClass {
    private int[] array = new int[1000000]; //будет храниться до тех пор пока жива хоть одна ссылка на InnerClass
    private String name;
    private InnerClass innerClass = new InnerClass();

    public EnclosingClass() {
        name = "Имя";
        innerClass.setSurname("Фамилия");
    }

    public String getName() {
        return name;
    }

    public InnerClass getInner() {
        return innerClass;
    }

    private void privateMethod() {
        System.out.println("Inside private method");
    }

    /**
     * вложенный клаас - имеет неявную ссылку на внешний
     * и доступ к его полям/методам
     */
    class InnerClass {
        private String surname;

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        void displayInfo() {
            System.out.println(name);
            System.out.println(surname);
            privateMethod();
        }

        void modifyEnclosing() {
            name = "Поменяли имя";
        }
    }
}
