public class Main {

    public static void main(String[] args) {
        Actor actor = new Actor("Ivan", "Petrov", Gender.MALE, 180);
        Actor otherActor = new Actor("Ivan", "Petrov", Gender.MALE, 180);

        System.out.println(actor.hashCode());
        System.out.println(otherActor.hashCode());
    }
}
