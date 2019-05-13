package ua.org.crazy.homework19.task03;

import java.util.List;
import java.util.Optional;

public class Artists {

    private List<Artist> artists;

    public Artists(List<Artist> artists) {
        this.artists = artists;
    }

    public Optional<Artist> getArtist(int index) {
        return Optional.ofNullable(artists.get(indexException(index)));
    }

    private int indexException(int index) {
        if (index < 0 || index >= artists.size()) {
            throw new IllegalArgumentException(index +
                    " doesn't correspond to an Artist");
        }
        return index;
    }

    public String getArtistName(int index) {
        return getArtist(index)
                .orElseThrow(IllegalArgumentException::new).getName();
    }
}
