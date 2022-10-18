package Collection;

import java.io.*;

public class FileIO_Class {

	public static void main(String[] args) throws IOException  {
		File folder = new File("/home/ramanujam/Downloads/eclipse-installer/My_Basic_program/src/Collection");
		
		String s ="ghjkfnn  y gtv yu jjjf ";
		char c[] = s.toCharArray();
		
//		String [] ls = folder.list();
//		for(String ss:ls)
//		System.out.println(ss);
//		
		System.out.println(folder.exists());
		try {
			folder.createNewFile();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(folder.canWrite());
		System.out.println(folder.delete());
		
		File f = new File (folder,"Docs.txt");//Write the file
//		FileWriter fr;
//		try {
//			fr = new FileWriter(f,false);
//			fr.write(c);
//			fr.write("\nHi macha this is ramanujam I'm good and u");
//			fr.close();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}

		
		System.out.println();
		
		
	try {
		FileReader fr2 = new FileReader(f); //Read the file 
			int i = fr2.read();
			while(i!=-1) {
				System.out.print((char)i);
				i= fr2.read();
			}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
		
		
	}

}
