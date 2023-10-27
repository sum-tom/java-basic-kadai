package kadai_011;

public class Prime_Chapter11{
	public static void main(String[] args) {
		
		boolean[] prime = new boolean[101];

		for (int i = 1; i < prime.length; i++) {
			prime[i] = true;
		}

		
		int divide = 2;
		while (divide < prime.length) {
			
			for (int i = divide + 1; i < prime.length; i++) {
				
				if (i % divide == 0) {
					prime[i] = false;
	                          continue;
				}
			}

			divide += 1;
		}

		
		for (int i = 2; i < prime.length; i++) {
			if (prime[i]) {
				System.out.println(i);
			}
		}
	}
}