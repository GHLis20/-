package algorithm3_2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class num_str_sort_file_1_1 {
	public static void main(String args[]) throws IOException {
		Scanner scanner = new Scanner(new File("C:\\Users\\ASUS\\Desktop\\1.inp"));
		int first = 0;
		String trash;
		List<String> listA = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			if ( first != 0) {
				String str = scanner.nextLine();
				//System.out.println(str);
				listA.add(str);
			}
			else {
				first++;
				trash = scanner.nextLine();
			}
		}
		listA.sort(null);
		for (int index = 0; index < listA.size(); index++) {
			   //System.out.println(listA.get(index));
			  }
		int leng2 = 0;
		int leng3 = 0;
		int nextlevel = 0;
		for(int k = 0; k < listA.size(); k++) {
			String[] array = listA.get(k).split(" ");
			leng2 = array[1].length();	//first name의 길이를 변수에 저장
			nextlevel++;
			if ( leng3 < leng2)
				leng3 = leng2;
				
		}
		
		System.out.println(leng3);		
	}
}
