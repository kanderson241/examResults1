import javax.swing.*;
import java.io.*;       

public class TOPPUPIL
{
     // array of MEMBER objects
        private PUPIL pupilList[];
        // number of members to be calculated after reading file
        int noOfPupils;
         FILEREADCSV EXAMdatafile;
    public TOPPUPIL()
    {
        EXAMdatafile = new FILEREADCSV(); 
        
    }
    
    
    public void processTopPupil() throws IOException
    {
      setUpPupilList();
      findMark();
    }
    
    private void setUpPupilList() throws IOException
    {
        System.out.println("Exam results: pupil results update");
        System.out.println("** preparing to read data file");
        
          String[] dataRows = EXAMdatafile.readCSVtable();
           // calculate the number of member rows, skip headings
          noOfPupils = dataRows.length - 1;
          
          System.out.println("** " + noOfPupils + " rows read.\n\n");
          
          //prepare array for pupils
          
          pupilList = new PUPIL[noOfPupils];
          //create pupil objects and copy data
          for (int i =0; i< noOfPupils; i++)
          {
              pupilList[i] = new PUPIL();
              // adjust to skip headings
              pupilList[i].readPupilDetails(dataRows[i+1]);
            }
              


    }
    
    public void findMark()
    {
    int maxDataPosition = 0;
    for (int i=1; i<20; i++){
        
        if(pupilList[i].findMark() <pupilList[maxDataPosition].findMark())
        {
            maxDataPosition = 1;
        }
    }
   }
         public void displayPupil() {
           // Heading for the display
           System.out.println("the pupil with the top mark is:\n");
           System.out.println("the mark is:\n");
           for  (int i = 0; i < noOfPupils; i++) 
            {
                pupilList[i].displayDetails();
          }
         // 2 blank line to separate this report from others.
         System.out.print("\n\n\n");
  

         // alternative using toString (if available)
 
         // Heading for the display
            System.out.println("A listing of all pupilsd marks\n");

        for  (int i = 0; i < noOfPupils; i++)
        {
            // will use toString
            System.out.println(pupilList[i]);
        }
        // 2 blank line to separate this report from others.
        System.out.print("\n\n\n");
   

     
    }
  }


