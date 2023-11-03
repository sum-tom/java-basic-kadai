package kadai_020;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		
		Dictionary_Chapter20 dictionarySearch = new Dictionary_Chapter20();
			
		String[] fruitArray = { "apple", "banana", "grape","orange" };
		
		for(String str : fruitArray) {
			dictionarySearch.fruitDictionary(str); 
		}	
	}
}
