class Animal {
    private String name;

    public void setName(String _name) {
        name = _name;
    }

    public void show() {
        System.out.println(name);
    }
}

// Subclass that inherits Animal class
class Whale extends Animal {
    private String character; // Characteristic of whale

    public void setCharacter(String _character) {
        character = _character;
    }

    public void showAll() {
        // Call parent class's show()
        show();
        // Print the character as well
        System.out.println(character);
    }
}
class Test {
    public static void main(String[] args) {
        Whale w = new Whale();
        w.setName("Whale");
        w.setCharacter("Big and Gentle");
        w.showAll();
    }
}