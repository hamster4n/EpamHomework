package ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.factories;

import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.filmStrip.soundtrack.EnglishSoundtrack;
import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.filmStrip.soundtrack.Soundtrack;
import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.filmStrip.subtitle.EnglishSubtitle;
import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.filmStrip.subtitle.Subtitle;

public class EnglishFactory implements Factory {
    @Override
    public Soundtrack createSoundtrack() {
        return new EnglishSoundtrack();
    }

    @Override
    public Subtitle createSubtitle() {
        return new EnglishSubtitle();
    }
}
