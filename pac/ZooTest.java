package pac;

import pac.zoo.TamaZoo;
import pac.zoo.animal.*;

public class ZooTest {
    public static void main(String[] args) {
        TamaZoo zoo = new TamaZoo();
        
        zoo.addAnimal(new Rabbit("MIMI"));
        zoo.addAnimal(new Elephant("MOMO"));
        zoo.meal();
    }
}