public class Cat extends Animal {
    public Cat (String name) {
        super(name, 200, 0);
        Animal.catCount++;
    }
}
