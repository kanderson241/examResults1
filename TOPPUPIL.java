import javax.swing.*;
import java.io.*;       

public class TOPPUPIL
{
    // array of MEMBER objects
    private PUPIL pupilList[];
    // number of members to be calculated after reading file
    int noOfPupils;
    FILEREADCSV EXAMdatafile;
    FILEWRITECSV resultFile;
    public TOPPUPIL()
    {
        EXAMdatafile = new FILEREADCSV(); 
        resultFile = new FILEWRITECSV();
    }

    public void processTopPupil() throws IOException
    {
        setUpPupilList();
        findMark();
    }

    public void setUpPupilList() throws IOException
    {
        System.out.println("Exam results: pupil results update");
        System.out.println("** preparing to read data file");

        String[] dataRows = EXAMdatafile.readCSVtable();
        // calculate the number of member rows, skip headings
        noOfPupils = dataRows.length;

        System.out.println("** " + noOfPupils + " rows read.\n\n");

        //prepare array for pupils

        pupilList = new PUPIL[noOfPupils];
        //create pupil objects and copy data
        for (int i =0; i< noOfPupils; i++)
        {
            pupilList[i] = new PUPIL();
            // adjust to skip headings
            pupilList[i].readPupilDetails(dataRows[i]);
        }

    }

    public void findMark() throws IOException
    {
        int maxDataPosition = 0;

        String fileContent = "";
        for (int i=0; i<noOfPupils; i++){

            //compare current value with best value
            if (pupilList[i].findMark() > pupilList[maxDataPosition].findMark()) 
            {
                // update the position of the best value
                maxDataPosition = i;     

            }

        }

        System.out.print("Position is:" + maxDataPosition + " , Value is:");
        pupilList[maxDataPosition].displayDetails();
        System.out.println();
        fileContent.concat(pupilList[maxDataPosition].writeDetails());
        System.out.println("** Preparing to write data file.");
        resultFile.writeCSVtable(fileContent);
        System.out.println("** File written and closed.");
    }

    public void displayPupil()
    {

        // Heading for the display

        for  (int i = 0; i < noOfPupils; i++) 
        {
            pupilList[i].displayDetails();
        }
        // 2 blank line to separate this report from others.
        System.out.print("\n\n\n");

        // alternative using toString (if available)
        // Heading for the display

    }
}
