package _17_IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class WordMge {	
	
	public void write() {
		try {
			File file = new File("Output.txt");
			FileWriter writer = new FileWriter(file, true);
			BufferedWriter bWriter = new BufferedWriter(writer);
			System.out.println("단어를 입력하세요.");
			Scanner in = new Scanner(System.in);
			String words = in.nextLine();
			bWriter.write(words + "\n");
			bWriter.flush();
			bWriter.close();
			
		} catch (Exception e) {
	            e.getStackTrace();
		}
	}
	public void readAll() {
		try {
			File file = new File("Output.txt");
			FileReader fReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fReader);
			
			while(true) {
	 			String line = bReader.readLine(); 
	 			if(line==null)	break; 
	 			System.out.println(line);
	 		}
	 		bReader.close();
		} catch(Exception e) {
			
		}		
	}
	
	public void clear() {
		try {
		File file = new File("Output.txt");
		FileWriter garbage;
			garbage = new FileWriter(file, false);
			garbage.close();
			System.out.println("텍스트 파일을 비웠습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void read() {
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		int cnt = 0;
		String line;
		try {
			File file = new File("Output.txt");
			FileReader fReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fReader);
			
			while((line = bReader.readLine()) != null) {
				cnt++;
				if(line.contains(word)) {
					System.out.println(cnt + "번째 줄: " + word);
				}
			}			
			cnt=0;
		} catch(Exception e) {
			e.getStackTrace();
		}
	}
	
	public void delete() {
		System.out.println("지울 단어를 입력하세요.");
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		int cnt = 0;
		String line;
		try {
			File file = new File("Output.txt");
			FileReader fReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fReader);
			
			while((line = bReader.readLine()) != null) {
				cnt++;
				if(line.contains(word)) {
					System.out.println(cnt + "번째 줄: " + word + "의 단어를 삭제합니다.");
				}
			}			
			cnt=0;
			
		} catch(Exception e) {
			e.getStackTrace();
		}
	}
	
}
