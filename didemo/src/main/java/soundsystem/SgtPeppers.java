package soundsystem;

import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class SgtPeppers implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public SgtPeppers(){}

    public SgtPeppers(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.print(title + "    " + artist);
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println(tracks.get(trackNumber));
    }
}
