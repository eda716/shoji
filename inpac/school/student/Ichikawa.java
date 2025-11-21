package pac.school.student;

public class Ichikawa extends AbstractStudent{

    public Ichikawa(String name){
        super(name);
    }

    @Override
    public void profile(){
        System.out.println("情報処理科の" + getName() + "はストリートファイターをやっています。");
    }
}