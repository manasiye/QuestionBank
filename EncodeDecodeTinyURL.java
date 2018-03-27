import java.util.HashMap;
import java.util.Random;

public class EncodeDecodeTinyURL {

	HashMapInteger, String map = new HashMap();
	Random r = new Random();
	int key = r.nextInt(1000000);

	public String encode(String longUrl) {
		while (map.containsKey(key) && key  99999)
			key = r.nextInt(1000000);
		map.put(key, longUrl);
		return httptinyurl.com + key;
	}

	public String decode(String shortUrl) {
		return map.get(Integer.parseInt(shortUrl.replace(httptinyurl.com, )));
	}

	public static void main(String[] args) {
		 TODO Auto-generated method stub
		EncodeDecodeTinyURL e = new EncodeDecodeTinyURL();
		System.out.println(e.encode(httpsleetcode.comproblemsdesign-tinyurl));
		System.out.println(e.decode(httptinyurl.com295826));
	}

}
