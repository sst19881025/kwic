package kwic.oo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChatMode {
	public void write(String file){
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
			FileWriter fw =new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
            boolean go_on = true;
            while (go_on) {
	            System.out.print("Add, Print, Quit:");
	            char c = br.readLine().charAt(0);
	            if (c =='a' || c == 'A') {
	            	String content = br.readLine();
	            	System.out.println("");
	    			bw.write(content);
	    			bw.newLine();
	            } else if (c =='p' || c =='P') {
	            	go_on = false;
	            } else if (c =='q' || c =='Q') {
	            	System.exit(0);
	            } else {
	            	System.out.println("Please input the right char.");
	            }
            }
            bw.flush();
            bw.close();
            fw.close();
            br.close();
            
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
