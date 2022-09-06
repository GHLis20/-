package algorithm3_2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class num_str_sort_file_1_1ver5 {
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
				leng3 = leng2;		//여기까지 first name 길이구하기
			
			
			
		}
		for(int k = 0; k < listA.size(); k++) {
			String[] array = listA.get(k).split(" ");
			leng2 = array[1].length();
			System.out.print(array[0]);
			System.out.print(" " + array[1]);
			//길이 부족한거 젤 긴거에서 그 길이 뺸 만큼 for문으로 어떤 변수에 " "를 추가해서 이걸 출력 후 3번쨰를 출력해보자
			int dif = 0;	//leng3-leng2인데 여기 for문에 넣는게 맞는진 잘 모르겠음 일단하고 아니면 고쳐봐 너무 졸려
			dif = leng3- leng2;
			String space = "";
			for ( int j = 0; j <= dif; j++)
				space += " ";
			System.out.println(space + array[2]);	
			//-를 사용한다면 젤 긴거는 -1 쓰면되고(?) 다른것들은 (leng3+7) - (7+leng2) 두 수의 차이만큼을 -앞에 넣으면 되긴할듯
			
		}
		
		//System.out.println(leng3);		//first name 가장 긴 길이 출력
		
	}
}
