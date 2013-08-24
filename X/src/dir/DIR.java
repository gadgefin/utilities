package dir;

import java.io.File;

public class DIR {

	  static int counter=-1;
	  
	  public static void main(String[] args) {
		    String name = "D:/";
		    File file = new File(name);
		    Run(file);
		  }

	  static void Run(File file) {
		  counter++;
	    String space = "";
	    for (int i = 0; i < counter; i++)
	      space += " ";
	    
	    if(file.isFile())
	      System.out.println(space + "[File] " + file.getName());
	    else if (file.isDirectory()) {
	      System.out.println(space + "[Directory] " + file.getName());
	      File[] arrayOfFiles = file.listFiles();
	      if(arrayOfFiles!=null) {
	        for (int i = 0; i < arrayOfFiles.length; i++)
	          Run(arrayOfFiles[i]);
	      }
	    }
	    	counter--;
	  }


}
