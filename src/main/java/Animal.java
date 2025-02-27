public abstract class Animal {
    private static int animalCount = 0;
    protected static int dogCount = 0;
    protected static int catCount = 0;
    protected static int tigerCount = 0;

    protected String name;
    protected float runLimit;
    protected float swimLimit;

    public Animal(String name, float runLimit, float swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }
    public static int getAnimalCount(){
        return animalCount;
    }
    public static int getDogCount(){
        return dogCount;
    }
    public static int getCatCount(){
        return catCount;
    }
    public static int getTigerCount(){
        return tigerCount;
    }

    public void run(float distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м");
        }
    }

    public void swim (float distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м");
        } else {
            System.out.println(name + " не смог проплыть");
        }
    }
}

