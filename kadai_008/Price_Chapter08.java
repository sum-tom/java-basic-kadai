package kadai_008;

public class Price_Chapter08 {
	public static void main(String[] args) {
	
	int userAge = 30;
	int serviceCost ;
	
	switch(userAge) {
	   case 10  -> {
		   			serviceCost=1000;
		   			System.out.println(userAge + "代の料金は"+ serviceCost +"円");
	   				}
	   case 20  -> {
  			serviceCost=2000;
  			System.out.println(userAge + "代の料金は"+ serviceCost +"円");
				}
	   case 30  -> {
  			serviceCost=3000;
  			System.out.println(userAge + "代の料金は"+ serviceCost +"円");
				}
	   case 40  -> {
  			serviceCost=3000;
  			System.out.println(userAge + "代の料金は"+ serviceCost +"円");
				}
	   case 50  -> {
  			serviceCost=4000;
  			System.out.println(userAge + "代の料金は"+ serviceCost +"円");
				}
	   case 60  -> {
  			serviceCost=4000;
  			System.out.println(userAge + "代の料金は"+ serviceCost +"円");
				}
	   case 70  -> {
  			serviceCost=4000;
  			System.out.println(userAge + "代の料金は"+ serviceCost +"円");
				}
	   case 80  -> {
  			serviceCost=5000;
  			System.out.println(userAge + "代の料金は"+ serviceCost +"円");
				}
	   default -> {
 			serviceCost=500;
 			System.out.println(userAge + "代の料金は"+ serviceCost +"円");
				}
	   }
	
	

	}
}
