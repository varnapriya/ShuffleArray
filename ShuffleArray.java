import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ShuffleArray {

	public static void main(String[] args) {
		Integer[] array={1,2,3,4,5,6,7};
        System.out.println("array before shuffle:" + Arrays.toString(array));	
       ArrayList<Integer> list=  new ArrayList<Integer>(Arrays.asList(array));
       
		 Collections.shuffle(list);
		
		list.toArray(array);
		 System.out.println("array after shuffle:" +Arrays.toString(array));
		 
		
	}

}
