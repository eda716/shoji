package pac.school.student;
public class WarSoStudent extends AbstractStudent {
    public WarSoStudent(String name) {
        super(name);
    }

    public void art() {
        System.out.println("画家の" + getName() + "は絵を描きます。");
    }
}

