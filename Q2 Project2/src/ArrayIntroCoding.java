
public class ArrayIntroCoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("intro to arrays");
		//declare any variable 
		int x;
		String str = "hello";
		double y = 3.14;
		
		//arrays - a collection of similar elements 
		//type[] arrayName = new type[];
		//create an int array of 10 integers
		int[] randomArray = new int[10];
		//primitives are initialized 
		//ints are init to 0
		//doubles -> 0.0
		//booleans -> false
		
		
		System.out.println(randomArray.length);
		
		//reading from a 1d array
		//call the array by its name
		//specify a location!
		System.out.println(randomArray[0]);
		
		//print the last element
		int lastIndex = randomArray.length -1;
		System.out.println(randomArray[lastIndex]);
		
		//write 7 to index 0
		randomArray[0] = 7;
		randomArray[1] = 8;
		randomArray[2] = 9;
		
		//two different ways to create arrays
		//1-way allows you to set values
		double[] myDoubles = {86.5, 99.9};
		double[] myDoubles2 = new double[2];
		myDoubles2[0] = 86.5;
		myDoubles2[1] = 99.9;
		
		//1d array of 31 integers
		int[] values = new int[31];
		
		for(int index=0; index<31; index++) {
			values[index] = (int)(Math.random()*2343);
		}
		
		for(int index = 0; index<values.length; index++) {
			System.out.println(values[index]);
		}
	}

}
