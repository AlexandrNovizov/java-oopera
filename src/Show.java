import java.util.ArrayList;

public class Show {

    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printDirectorInfo() {
        System.out.println("Режиссер спектакля '" + title + "':");
        System.out.println(director);
    }

    public void printAllActors() {
        System.out.println("Актеры, участвующие в спектакле '" + title + "':");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Этот актер уже участвует в спектакле '" + title + "'");
            return;
        }
        listOfActors.add(actor);
    }

    public void replaceActor(Actor newActor, String replacedAuthorSurname, boolean replaceAll) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Актер уже участвует в спектакле!");
            return;
        }
        ArrayList<Actor> actorsToReplace = new ArrayList<>();
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(replacedAuthorSurname)) {
                actorsToReplace.add(actor);
            }
        }

        if (!actorsToReplace.isEmpty()) {
            if (actorsToReplace.size() == 1) {
                listOfActors.remove(actorsToReplace.getFirst());
                listOfActors.add(newActor);
                return;
            }

            if (replaceAll) {
                for (Actor actorToReplace : actorsToReplace) {
                    listOfActors.remove(actorToReplace);
                }
                listOfActors.add(newActor);
            } else System.out.println("Найдено несколько актеров с заданной фамилией, замена отменена");
            return;
        }

        System.out.println("Актер с фамилией '" + replacedAuthorSurname + "' отсутствует в списке спектакля '" + title + "'");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }
}
