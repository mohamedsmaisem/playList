public class Main {
    public static void main(String[] args) {
        User user1 = new User(1,"mohamed");
        Artist artist1 = new Artist(1,"Britney Spears");
        Artist artist2 = new Artist(2,"Capital bra");
        Track track1 = new Track(1,"Toxic",artist1);
        Track track2 = new Track(3,"Berlin lebt",artist2);
        Track track3 = new Track(4,"Baby one more time!",artist1);




        Player player1 = new Player();
        player1.play(track1,user1);
        player1.play(track1,user1);
        player1.play(track1,user1);
        player1.play(track2,user1);
        player1.play(track3,user1);



        System.out.println( "the top artist is " + user1.getTopArtist().getName());
        System.out.println( "favorite track is " +user1.getTopTrack().getName());
        System.out.println( " top fan is "  +artist1.getTopFan().getName());





    }
}
