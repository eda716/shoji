package pac.zoo.animal;

public class Elephant extends AbstractAnimal{

    public Elephant (String name){
        super (name);
    }

    public void eat(){
        System.out.println("ゾウ"+ getName()+"は野菜を食べます");
    }
}