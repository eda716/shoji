package pac.zoo.animal;

public class Giraffe extends AbstractAnimal{

    public Giraffe(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("キリンの" + getName() + "は草をむしゃりむしゃりと食べます。");
    }
}