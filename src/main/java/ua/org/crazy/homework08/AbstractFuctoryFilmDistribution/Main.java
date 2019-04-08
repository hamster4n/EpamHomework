package ua.org.crazy.homework08.AbstractFuctoryFilmDistribution;

import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.factories.EnglishFactory;
import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.factories.Factory;
import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.factories.RussianFactory;
import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.factories.SpanishFactory;
import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.filmStrip.Film;

public class Main {
    public static final String LANGUAGE = "spanish";

    public static void main(String[] args) {
        Film film = configureFilm();
        film.play();

    }

    private static Film configureFilm() {
        Film film;
        Factory factory = null;
        String lang = LANGUAGE.toLowerCase();
        switch (lang) {
            case "russian": {
                factory = new RussianFactory();
                break;
            }
            case "english": {
                factory = new EnglishFactory();
                break;
            }
            case "spanish": {
                factory = new SpanishFactory();
                break;
            }
            default:{
                System.out.println("Wrong language!");
            }

        }
        return new Film(factory);
    }
}
