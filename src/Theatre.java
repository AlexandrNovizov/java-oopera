import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor ivanov = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor petrova = new Actor("Лариса", "Петрова", Gender.FEMALE, 167);
        Actor kovalsky = new Actor("Александр", "Ковальски", Gender.MALE, 183);

        Director krasnopuzov = new Director("Алексей", "Краснопузов", Gender.MALE, 9);
        Director lanevskaya = new Director("Екатерина", "Ланевская", Gender.FEMALE, 11);

        Person composer = new Person("Петр", "Прохоров", Gender.MALE);
        Person choreographer = new Person("Татьяна", "Филармонова", Gender.FEMALE);

        ArrayList<String> librettoForOpera = new ArrayList<>();
        librettoForOpera.add("Ля-ля");
        librettoForOpera.add("Тополя");

        ArrayList<String> librettoForBallet = new ArrayList<>();
        librettoForBallet.add("Танцуем раз");
        librettoForBallet.add("Танцуем два");

        Show regular = new Show("Обычный", 180, krasnopuzov, new ArrayList<>());
        Opera opera = new Opera("Оперный", 175, lanevskaya, new ArrayList<>(), composer,
                librettoForOpera, 13
        );
        Ballet ballet = new Ballet("Балет", 185, lanevskaya, new ArrayList<>(), composer,
                librettoForBallet, choreographer);

        regular.addActor(ivanov);
        regular.addActor(petrova);

        opera.addActor(kovalsky);
        opera.addActor(ivanov);

        ballet.addActor(petrova);
        ballet.addActor(kovalsky);

        regular.printAllActors();
        opera.printAllActors();
        ballet.printAllActors();

        opera.replaceActor(petrova, ivanov.getSurname());
        opera.printAllActors();

        ballet.replaceActor(ivanov, "Негожин");

        opera.printLibretto();
        ballet.printLibretto();
    }
}
