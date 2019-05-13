package ua.org.crazy.homework19.task03;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArtistsTest {
    private static Artists artists;
    private static final int FAKE_INDEX = -5;
    private static final int TRUE_INDEX = 1;
    private static Artist artist1;

    @BeforeClass
    public static void init() {
        artist1 = new Artist("Ivan");
        Artist artist2 = new Artist("John");
        List<Artist> list = new ArrayList<>();
        list.add(artist1);
        list.add(artist2);
        artists = new Artists(list);
    }

    @Test
    public void methodGetArtistShouldReturnNullInOptional() {
        Optional<Artist> actual = artists.getArtist(FAKE_INDEX);
        assertFalse(actual.isPresent());
    }

    @Test
    public void methodGetArtistShouldReturnObjectInOptional() {
        Optional<Artist> actual = artists.getArtist(TRUE_INDEX);
        assertTrue(actual.isPresent());
    }

    @Test
    public void methodGetArtistNameShouldReturnArtistName(){
        String artistName = artists.getArtistName(0);
        assertEquals(artist1.getName(), artistName);
    }

    @Test(expected = IllegalArgumentException.class)
    public void methodGetArtistNameShouldThrowIllegalArgumentException(){
        //TODO: не могу понять почему не кидает IllegalArgument
        artists.getArtistName(FAKE_INDEX);
    }

    @Test(expected = NoSuchElementException.class)
    public void methodGetArtistNameShouldThrowNoSuchElementException(){
        artists.getArtistName(FAKE_INDEX);
    }
}