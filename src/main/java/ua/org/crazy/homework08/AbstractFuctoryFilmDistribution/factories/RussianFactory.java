package ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.factories;

import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.filmStrip.soundtrack.RussianSoundtrack;
import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.filmStrip.soundtrack.Soundtrack;
import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.filmStrip.subtitle.RussianSubtitle;
import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.filmStrip.subtitle.Subtitle;

public class RussianFactory implements Factory {
    @Override
    public Soundtrack createSoundtrack() {
        return new RussianSoundtrack();
    }

    @Override
    public Subtitle createSubtitle() {
        return new RussianSubtitle();
    }
}
