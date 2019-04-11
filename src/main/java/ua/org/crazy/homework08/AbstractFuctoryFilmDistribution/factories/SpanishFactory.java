package ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.factories;

import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.filmStrip.soundtrack.Soundtrack;
import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.filmStrip.soundtrack.SpanishSoundtrack;
import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.filmStrip.subtitle.SpanishSubtitle;
import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.filmStrip.subtitle.Subtitle;

public class SpanishFactory implements Factory {
    @Override
    public Soundtrack createSoundtrack() {
        return new SpanishSoundtrack();
    }

    @Override
    public Subtitle createSubtitle() {
        return new SpanishSubtitle();
    }
}
