public class Player {

    public static void play(Track track, User user){
        user.addTrack(track);
        track.getArtist().addUser(user);
        System.out.println(  "playing: " + track.getArtist().getName() + " - " + track.getName());

    }
}
