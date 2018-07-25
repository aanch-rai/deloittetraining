//We generate Random numbers using an object of the random class

package Day8;

import java.util.Random;
import java.util.function.DoubleConsumer;
import java.util.stream.DoubleStream;

public class usingRandom
{
	public static void main(String[] args) {
	
	Random r = new Random();
	System.out.println(r.nextInt(20)+10);
	DoubleStream stream = r.doubles(6,5,10); //6 times between 5 and 10
	stream.forEach(new DoubleConsumer() {
		
		@Override
		public void accept(double value) {
			System.out.println(value);
			// TODO Auto-generated method stub
			
		}
	});
	
	}
	
}
