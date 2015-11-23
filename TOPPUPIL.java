
import javax.swing.*;
import java.io.*;       

public class TOPPUPIL
{
     // array of MEMBER objects
        private PUPIL pupilList[];
        // number of members to be calculated after reading file
        int noOfpupils;
         FILEREADCSV EXAMdatafile;
    public TOPPUPIL()
    {
        EXAMdatafile = new FILEREADCSV(); 
        
    }
    
    
    public void processTopPupil() throws IOException
    {
      setUpPupilList();
      findTopPupil();
    }
    
    private void setUpPupilList() throws IOException
    {
        System.out.println("Exam results: pupil results update");
        System.out.println("** preparing to read data file");
        
          String[] dataRows = EXAMdatafile.readCSVtable();
           // calculate the number of member rows, skip headings
          noOfpupils = dataRows.length - 1;
          
          System.out.println("** " + noOfpupils + " rows read.\n\n");


    }
    
    public void findTopPupil()
    {
        
    }
   
}