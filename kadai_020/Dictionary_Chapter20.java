package kadai_020;
import java.util.HashMap;

public class Dictionary_Chapter20 {
	
	public void fruitDictionary(String fruitWord) {
	
		HashMap<String,String> fruitMap = new HashMap<String,String>();

		fruitMap.put("apple", "りんご");
		fruitMap.put("peach", "桃");
		fruitMap.put("banana", "バナナ");
		fruitMap.put("lemon", "レモン");
		fruitMap.put("pear", "梨");
		fruitMap.put("kiwi", "キウィ");
		fruitMap.put("strawberry", "いちご");
		fruitMap.put("grape", "ぶどう");
		fruitMap.put("muscat", "マスカット");
		fruitMap.put("cherry", "さくらんぼ");
		
		
		if (fruitMap.get(fruitWord) != null) {
			System.out.println(fruitWord + "の意味は" + fruitMap.get(fruitWord));
		} else {
			System.out.println("辞書に" + fruitWord + "は存在しません。");
		}
	
	
	
	}
		
    
	
	

}
