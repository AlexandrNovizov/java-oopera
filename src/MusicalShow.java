import java.util.ArrayList;

public class MusicalShow extends Show {

    protected Person musicAuthor;
    protected ArrayList<String> librettoText;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                       Person musicAuthor, ArrayList<String> librettoText) {

        super(title, duration, director, listOfActors);

        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Либретто спектакля '" + title + "':");
        for (String line : librettoText) {
            System.out.println(line);
        }
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(Person musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public ArrayList<String> getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(ArrayList<String> librettoText) {
        this.librettoText = librettoText;
    }
}
