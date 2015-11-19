import javax.swing.*;
import java.io.*;                   
public class FILEREADCSV
{
   private FileReader fReader;
    public String[]  readCSVtable() throws IOExpection
    {
        File currentDir = new File ("").getAbsoluteFile();
        final JFileChooser fc = new FileChooser(currentDir);
        int returnVal = fc.showOpenDialog(null);
        file csvFile = fc.getSelectedFile();
        
        char[] inBUffer = new char [5000];
        
        fReader = new FileReader(csvFile);
        int size = fReader.read(inBuffer);
        fReader.closer();
        
        String fileContent = String.valueOf(inbuffer)
        