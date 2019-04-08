package ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.factories;

import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.filmStrip.soundtrack.Soundtrack;
import ua.org.crazy.homework08.AbstractFuctoryFilmDistribution.filmStrip.subtitle.Subtitle;

public interface Factory {
    Soundtrack createSoundtrack();
    Subtitle createSubtitle();
}
