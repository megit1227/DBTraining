package animal;

public class TestAnimal {

    public static void main(String[] args) {
        Animal cow = new Animal("cow", 7, "moo");
        Animal lion = new Animal("lion", 6, "rawr");

        System.out.println(cow.toString());
        System.out.println(lion.toString());
    }
}
