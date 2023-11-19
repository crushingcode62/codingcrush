import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Song {
    private String songTitle;
    private String artist;

    public Song(String songTitle, String artist) {
        this.songTitle = songTitle;
        this.artist = artist;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getArtist() {
        return artist;
    }
}

class MusicLibrary {
    private List songs;

    public MusicLibrary() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Added song: " + song.getSongTitle() + " by " + song.getArtist());
    }

    public void removeSong(Song song) {
        songs.remove(song);
        System.out.println("Removed song: " + song.getSongTitle() + " by " + song.getArtist());
    }

    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the library.");
            return;
        }

        Random random = new Random();
        int randomIndex = random.nextInt(songs.size());
        Song randomSong = songs.get(randomIndex);

        System.out.println("Playing random song: " + randomSong.getSongTitle() + " by " + randomSong.getArtist());
    }
}

public class MusicLibraryTest {
    public static void main(String[] args) {
        // Create an instance of the MusicLibrary class
        MusicLibrary myMusicLibrary = new MusicLibrary();

        // Add songs to the music library
        myMusicLibrary.addSong(new Song("Song 1", "Artist 1"));
        myMusicLibrary.addSong(new Song("Song 2", "Artist 2"));
        myMusicLibrary.addSong(new Song("Song 3", "Artist 3"));

        // Play a random song
        myMusicLibrary.playRandomSong();

        // Remove a song from the music library
        myMusicLibrary.removeSong(new Song("Song 2", "Artist 2"));

        // Play a random song again
        myMusicLibrary.playRandomSong();
    }
}
  