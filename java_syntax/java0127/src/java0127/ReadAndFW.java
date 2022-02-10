package java0127;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadAndFW {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		PrintWriter pw=null;	// 닫아주기 위해서 try밖에서 선언
		
		String line="";
		try {
			pw = new PrintWriter(new FileWriter("a.txt"),true);
			while((line=br.readLine())!=null) {
				pw.println(line);
				pw.flush();
			}
			
		} catch(IOException e){
			System.out.println(e);
		} finally {				//반드시 닫아야한다.
			pw.close();
		}
				
	}
}
