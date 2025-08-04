// Last updated: 8/4/2025, 6:54:44 PM
import java.util.HashMap;

public class Codec {

    private HashMap<String, String> shortToLong = new HashMap<>();
    private HashMap<String, String> longToShort = new HashMap<>();
    private static final String BASE = "http://tinyurl.com/";
    private int id = 0;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (longToShort.containsKey(longUrl)) {
            return longToShort.get(longUrl);
        }
        String shortUrl = BASE + id;
        shortToLong.put(shortUrl, longUrl);
        longToShort.put(longUrl, shortUrl);
        id++;
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return shortToLong.get(shortUrl);
    }
}
