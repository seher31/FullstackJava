
public final class Loopingconstructs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int i=10;
		
		System.out.println("before the loop starts..........................");
		while(i>0) {
			System.out.println(i);
			--i;
		}
		System.out.println("After the loop ends..............................");
		
		System.out.println("before the loop starts..........................");
		
		while(i<10) {
			
			++i;
			System.out.println(i);
			
		}
		System.out.println("After the loop ends..............................");
	}

}
