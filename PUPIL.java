//pupil
// Kaitlyn Anderson
import javax.swing.JOptionPane;

public class PUPIL
 {
    private String firstName;
    private String surname;
    private int mark;
    private int findMark;
    
    public PUPIL()
    {
        //intialise instance variables
        firstName = "";
        surname = "";
        mark = 0;
  }

    public void readPupilDetails(String dataItems)
   {
    String[] rowItems = dataItems.split(",");
    firstName = rowItems[0];
    surname = rowItems[1];
    mark = Integer.parseInt(rowItems[2]);
      }


    public String writeDetails()
    {
    String pupilData = "";
    pupilData = pupilData.concat(firstName);
    pupilData = pupilData.concat(",");
    pupilData = pupilData.concat(surname);
    pupilData = pupilData.concat(",");
    pupilData = pupilData.concat(Integer.toString(mark));
    return pupilData;
  }

    public int findMark()
  {
    return mark;
  }

    public void displayDetails()
  {
    System.out.println("pupil: "+ firstName + " " + surname);
    System.out.println(", mark is " + mark);
    System.out.println();
  }
 }
