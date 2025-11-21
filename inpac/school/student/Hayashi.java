package pac.school.student;

public class Hayashi extends AbstractStudent{

    public Hayashi(String name){
        super(name);
    }

    @Override
    public void profile(){
        System.out.println("情報処理科の" + getName() + "は野球が好きです。");
    }
}