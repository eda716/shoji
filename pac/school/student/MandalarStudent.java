package pac.school.student;
public class MandalarStudent extends AbstractStudent {
      public MandalarStudent(String name) {
        super(name);
    }

    public void art() {
        System.out.println("料理の" + getName() + "は料理を作ります。");
    }
}