public class Main {
    public static void main(String[] args) {
        System.out.println("The first persons name and age are: ");
        Person p1 = new firstPerson("Youssef",25);
        System.out.println(p1.toString());
        System.out.println("The second persons name and age are:");
        Person p2 = new secondPerson("Mohammad", 27);
        System.out.println(p2.toString());

    }
}