package ua.org.crazy.homework19.task03;

import java.util.List;
import java.util.Optional;

public class Artists {

    private List<Artist> artists;

    public Artists(List<Artist> artists) {
        this.artists = artists;
    }
    private Optional<Artist> getArtist(int index) {
        if (index < 0 || index >= artists.size()) {
            indexException(index);
        }
        return Optional.ofNullable(artists.get(index));
    }
    private void indexException(int index) {
        throw new IllegalArgumentException(index +
                " doesn't correspond to an Artist");
    }

    public String getArtistName(int index) {
        try {
            Artist artist = getArtist(index).get();
            return artist.getName();
        } catch (IllegalArgumentException e) {
            return "unknown";
        }
    }
}
