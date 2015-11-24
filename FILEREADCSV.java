import javax.swing.*;
import java.io.*;                   
public class FILEREADCSV
{
   private FileReader fReader;
    public String[]  readCSVtable() throws IOException
    {
        File currentDir = new File ("").getAbsoluteFile();
        final JFileChooser fc = new JFileChooser(currentDir);
        int returnVal = fc.showOpenDialog(null);
        File csvFile = fc.getSelectedFile();
        
        char[] inBuffer = new char [5000];
        
        fReader = new FileReader(csvFile);
        int size = fReader.read(inBuffer);
        fReader.close();
        
        String fileContent = String.valueOf(inBuffer);
        return fileContent.split("\n");
    }
}
        