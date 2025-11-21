package pac.school.student;

public class Koshigumo extends AbstractStudent{

    public Koshigumo(String name){
        super(name);
    }

    @Override
    public void profile(){
        System.out.println("情報処理科の" + getName() + "はVALORANTをプレイします。");
    }
}