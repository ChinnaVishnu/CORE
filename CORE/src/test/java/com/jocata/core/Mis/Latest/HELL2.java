package com.jocata.core.Mis.Latest;

import java.io.File;

public class HELL2 {

	
	//......................Working Fine............................//
	
	public String strr = null;
	public String click(){
		File folder = new File("D:\\AUTOMATION REQUIRED DOCS\\MisReportsDownloads");
		File[] listOfFiles = folder.listFiles();

			if (listOfFiles[0].isFile()) {
				File lis = listOfFiles[0];
				 strr = lis.toString();
				 
				 
		
		
	}
			
			return strr;
	}
	
public static void main(String[] args) {
	HELL2 h=new HELL2();

String p=h.click();
System.out.println(p);
}	
	
}
