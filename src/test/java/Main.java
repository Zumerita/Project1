public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Тимми"),
                new Cat("Рыжик"),
                new Tiger("Полосатик"),
                new Cat ("Финн"),
                new Dog("Михалыч")

        };
        for (Animal animal : animals) {
            animal.run(300);
            animal.swim(50);
        }

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Animal.getDogCount());
        System.out.println("Кошек: " + Animal.getCatCount());
        System.out.println("Тигров: " + Animal.getTigerCount());
    }
}