public class WordCount {

    public static int wordCount(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0; // Jika string kosong atau hanya berisi spasi, return 0
        }
        // Menghitung kata dengan memisahkan berdasarkan spasi
        return str.split("\\s+").length;
    }
}
