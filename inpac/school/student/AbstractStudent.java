package pac.school.student;

public abstract class AbstractStudent{

    private String name;

    public AbstractStudent(String name){
        this.name = name;
    }

    public abstract void profile();
    public void jugyo(){
        System.out.println("授業を受けます。");
    }
    public String getName(){
        return name;
    }
}