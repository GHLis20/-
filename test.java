package algorithm3_2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class test {
	public static void main(String args[]) throws IOException {
		try {
			Scanner scanner = new Scanner(new File("./test.inp"));
			File file = new File("./test.out");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter(fw);

			int first = 0;
			String trash;
			List<String> listA = new ArrayList<String>();
			while (scanner.hasNextLine()) {
				if ( first != 0) {
					String str = scanner.nextLine();
	
					listA.add(str);
				}
				else {
					first++;
					trash = scanner.nextLine();
				}
			}
			listA.sort(null);
			for (int index = 0; index < listA.size(); index++) {
				
	
				
			}
			int leng2 = 0;
			int leng3 = 0;
			int nextlevel = 0;
			for(int k = 0; k < listA.size(); k++) {
				String[] array = listA.get(k).split(" ");
				leng2 = array[1].length();	
				nextlevel++;
				if ( leng3 < leng2)
					leng3 = leng2;		
				
				
				
			}
			String[] same = new String[20];
			int[] count3 = new int[20]; 
			String same2 = "";
			for(int k = 0; k < listA.size(); k++) {
				String[] array = listA.get(k).split(" ");
				leng2 = array[1].length();
				System.out.print(array[0]);
				writer.write(array[0]);
				System.out.print(" " + array[1]);
				writer.write(" " + array[1]);
	
				int dif = 0;	
				dif = leng3- leng2;
				String space = "";
				for ( int j = 0; j <= dif; j++)
					space += " ";
				System.out.println(space + array[2]);
				writer.write(space + array[2] + "\n");
				//same[k] = array[2];		//
				if ( same2 == array[2]) {
					same[k] = array[2];
					count3[k]++;
				}
				else
					same2 = array[2];
	
				
			}
		

			writer.close();
		}catch (IOException e) {
			e.printStackTrace();
			}
		
		
	}
}
