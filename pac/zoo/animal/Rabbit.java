package pac.zoo.animal;

public class Rabbit extends AbstractAnimal{

    public Rabbit (String  name){
        super (name);
    }

    public void eat(){
        System.out.println("ウサギの"+getName()+"は野菜を食べます");
    }
}