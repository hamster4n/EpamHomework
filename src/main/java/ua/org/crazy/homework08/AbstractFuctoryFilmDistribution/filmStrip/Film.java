package ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.filmStrip;

import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.factories.Factory;
import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.filmStrip.soundtrack.Soundtrack;
import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.filmStrip.subtitle.Subtitle;

public class Film {
    private Soundtrack soundtrack;
    private Subtitle subtitle;

    public Film(Factory factory) {
        soundtrack = factory.createSoundtrack();
        subtitle = factory.createSubtitle();
    }

    public void play(){
        soundtrack.play();
        subtitle.play();
    }
}
