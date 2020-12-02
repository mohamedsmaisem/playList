import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class User {
    private int id;
    private String name;

    Map<Track, Integer> trackplayed = new HashMap<Track, Integer>();
    Map<Artist, Integer> artistListningTo = new HashMap<Artist, Integer>();






    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addTrack(Track track) {
        if (trackplayed.get(track) == null) {
            trackplayed.put(track, 1);
        } else {
            trackplayed.put(track, trackplayed.get(track) + 1);
        }
        addArtist(track.getArtist());

    }


    public void addArtist(Artist artist) {
        if (artistListningTo.get(artist) == null) {
            artistListningTo.put(artist, 1);
        } else {
            artistListningTo.put(artist, artistListningTo.get(artist) + 1);
        }

    }

    public Artist getTopArtist() {
        Integer max = 0;
        Artist topArtist = null;
        for (Map.Entry<Artist, Integer> entry : artistListningTo.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                topArtist = entry.getKey();

            }

        }
        return topArtist;
    }


    public Track getTopTrack() {

        Integer max = 0;
        Track topTrack = null;
        for (Map.Entry<Track, Integer> entry : trackplayed.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                topTrack = entry.getKey();

            }

        }
        return topTrack;
    }











    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
