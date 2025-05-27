package crio.java111.session8;

public class CheckIfMouse {
    public static String braveAndMice(String animal) {
        return animal.toLowerCase() == "mouse" ? "Hide" : "Walk";
    }

    public static void main(String[] args) {

        String animal = "Dog";
        System.out.println(braveAndMice(animal).equals("Walk"));

        animal = "Mouse";
        System.out.println(braveAndMice(animal).equals("Hide"));
        animal = "mouse";
        System.out.println(braveAndMice(animal).equals("Hide"));
        animal = "MoUsE";
        System.out.println(braveAndMice(animal).equals("Hide"));
    }
}
