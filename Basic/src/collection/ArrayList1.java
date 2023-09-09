package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.array.arr;

public class ArrayList1 {

	public static void main(String[] args) {
		String sample_array[]
		           = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		       ArrayList<String> a1 = new ArrayList<>();
		       int length_array = sample_array.length;
		       System.out.println("The input elements are as follows : ");
		       for(int i = 0; i < length_array; i ++)
		       {
		           System.out.print(sample_array[i] + " ");
		       }
		       System.out.println();
		   
		       List converted_list = Arrays.asList(sample_array);// converting the array to a list
		      
		       //array.asList ... class name.method name
		       System.out.println("The converted list is as follows : "
		                          + converted_list);
		    
		     
	}

}
