package pac.zoo.animal;

public class Zebra extends AbstractAnimal{

    public Zebra(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("シマウマの" + getName() + "は草をむしゃむしゃ食べます。");
    }
}