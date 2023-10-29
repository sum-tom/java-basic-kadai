package kadai_014;

public class Car_Chapter14 {
	
		private int gear = 1;
		private int speed = 10;
		
		public Car_Chapter14(int gear,int speed) {
			this.gear = gear;
			this.speed = speed;		
		}
		
		public  void gearChange(int afterGear) {
			speed = switch(afterGear) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 ->  30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
			};
			System.out.println(gear+"から"+ afterGear + "に切り替えました"  );	
			
		}
		
		public void run() {
			
			System.out.println("速度は時速"+ speed + "kmです"  );
		}
	
}
