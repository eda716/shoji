package pac.zoo.animal;

public class Cheetah extends AbstractAnimal{

    public Cheetah(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("チーターの" + getName() + "は肉をガシガシ食べます。");
    }
}