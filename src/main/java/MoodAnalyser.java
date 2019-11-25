public class MoodAnalyser {
    String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message=message;

    }

    public String analyseMood(String message) {
    try {
        if (message.contains("SAD")) {
            return "SAD";
        } else {
            return "Happy";
        }
    }catch (NullPointerException e){
        return "HAPPY";
    }
    }
}

