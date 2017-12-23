/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileappender;
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
       File folder=new File("C:\\Users\\shrey\\Desktop\\mobileLogData");
       File[] listOfFiles=folder.listFiles();
       String st,content = "";
       int count=1;
       for (int i = 0; i < listOfFiles.length; i++) {
              File file = listOfFiles[i];
          if (file.isFile() && file.getName().endsWith(".txt")) {
         BufferedReader br=new BufferedReader(new FileReader(file));
         
         while((st=br.readLine())!=null){
             if(st.contains("DiffCount")){
                 content += "\n"+st+"\n";
                 content += "\r\n";
           }
             count++;
         }
    /* do somthing with content */
         
         
  }
          
}
    File fileop = new  File("C:\\Users\\shrey\\Desktop\\NewData.txt");

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
