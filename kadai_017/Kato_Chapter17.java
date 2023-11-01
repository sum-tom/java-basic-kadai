package kadai_017;

 abstract public class Kato_Chapter17 {
	
	//フィールド
	public final String familyName = "加藤";
	 public String givenName  = "";
	public final String address	 = "東京都中野区〇×";

	//メソッド
	//共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println( "名前は" + familyName + givenName +"です");
		System.out.println( address + "です");	
	}
	//個別の紹介を出力する
	abstract  void eachIntroduce() ;
		
	
	//紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
