package OOPS_Part2andArrays.Assignment_1;

public class reverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		//System.out.println(array[1]);
		int a = array.length;
		
		// To check the length of the array
		System.out.println("Length of the Array is: " + a);
		
		while(a<=array.length){
			a--;
			if(a<0){
				// If value is less than 0, while loop will exit
				break;
			}				
			System.out.println(array[a]);
		}					
	}

}
