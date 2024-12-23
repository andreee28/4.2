public class WordCount {

    public static int wordCount(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        return str.split("\\s+").length;
    }
}
