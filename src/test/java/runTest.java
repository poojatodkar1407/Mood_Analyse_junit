import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class runTest {
    @Test
    public void RunTestForHappyMood() {
        MoodAnalyser moodAnalyser= new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Happy message");

        assertEquals("Happy",mood);
    }

//    @Test
//    public void RunTestForSadMood() {
//        MoodAnalyser moodAnalyser= new MoodAnalyser();
//        String mood = moodAnalyser.analyseMood("This is a sad message");
//
//        assertEquals("SAD",mood);
//    }

   @Test
    public void RunTestForNullMood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood("this is null mood");

        assertEquals("Happy",mood);

   }
}