# Search-a-string-from-all-files-in-a-folder-and-concatenate-in-a-new-document
Search a string from all files in a folder and concatenate/paste/write in a new text document
 # I Used Netbeans 8.0.2 so for Netbeans Users they can download Folder / FileAppender.java for basic code
 
## CODE :
import java.io.*;
/**
 *
 * @author shrey
 */
public class FileAppender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
       File folder=new File("C:\\pathof Folder to input txt files");
       File[] listOfFiles=folder.listFiles();
       String st,content = "";
       int count=1;
       for (int i = 0; i < listOfFiles.length; i++) {
              File file = listOfFiles[i];
          if (file.isFile() && file.getName().endsWith(".txt")) {
         BufferedReader br=new BufferedReader(new FileReader(file));
         
         while((st=br.readLine())!=null){
            if(st.contains(" ")){   // Enter String to be searched
                 content += "\n"+st+"\n";
                 content += "\r\n";
           }
             count++;
         }
    /* do somthing with content */
         
         
  }
          
}
    File fileop = new  File("\pathof Folder to output txt document");

        // if file doesnt exists, then create it
        if (!fileop.exists()) {
            fileop.createNewFile();
        }

        FileWriter fw = new FileWriter(fileop.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close();

        System.out.println("Done and No. of Counts or files="+count);
    
    }
    
}
