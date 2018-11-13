package soundsystem;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class TrackCounter {

    private Map<Integer,Integer> trackCounts = new HashMap<>();

    @Pointcut("execution(* soundsystem.CompactDisc.playTrack(int)) && args(trackNumber)")
    public void trackPlayed(int trackNumber){}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber){
        int currentTrack = trackCounts.getOrDefault(trackNumber,0);
        trackCounts.put(trackNumber,currentTrack + 1);
    }

    public int getTrackCount(int trackNumber){
        return trackCounts.getOrDefault(trackNumber,0);
    }
}
