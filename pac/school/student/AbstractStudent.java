package pac.school.student;

public abstract class AbstractStudent{
    private String name;

    public AbstractStudent(String name){
        this.name = name;
    }

    public abstract void art();
    
    public String getName(){
        return name;
    }

}