package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {

	
	 public String getMyChoice() {
		 Scanner scanner = new Scanner(System.in);
		 String inputHand = scanner.next();
		 
		 	while(true) {
		 		if( inputHand.equals("r") || inputHand.equals("s") || inputHand.equals("p") ) {
		 			
		 			return inputHand;
		 		}else {
		 			System.out.println("エラーです。再度入力お願い致します。");
		 			continue;
		 		}
	 		}
		 	
	 }
 	
	 public String getRandom() {
			 String[] enemyHand = {"r","s","p"};
			 int num = (int) Math.floor(Math.random()*2);
			 return enemyHand[num];
	 }
	 
	 public void playGame() {
		  String mySelect = getMyChoice();
		  String enemySelect = getRandom();
		  
		  HashMap<String,String> typeHand = new HashMap<String,String>();
		  
		  typeHand.put("r","グー");
		  typeHand.put("s","チョキ");
		  typeHand.put("p","パー");
		  
		  System.out.println("自分の手は" + typeHand.get(mySelect) + ",対戦相手の手は" + typeHand.get(enemySelect));
		  
		  if(mySelect.equals(enemySelect)) {
			  System.out.println("あいこです");
			  
		  }else if((mySelect.equals("r") && enemySelect.equals("s"))
				  ||(mySelect.equals("s") && enemySelect.equals("p"))
				  ||(mySelect.equals("s") && enemySelect.equals("p"))) {
			  System.out.println("自分の勝ちです");
		  }else {
			  System.out.println("自分の負けです");
		  }
	 }
	

}
