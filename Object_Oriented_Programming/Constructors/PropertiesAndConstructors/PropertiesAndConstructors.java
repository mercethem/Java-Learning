//This package details taken from Abdul Bari's videos. First i tried myself and then completed from videos.

package Object_Oriented_Programming.Constructors.PropertiesAndConstructors;

class Subjects {
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subjects(String subID, String name, int maxMarks) {
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String getSubID() {
        return subID;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtain() {
        return marksObtain;
    }

    public void setMaxMark(int maxMarks) {
        if (maxMarks < 0)
            maxMarks = 0;
        else if (maxMarks > 100)
            maxMarks = 100;
    }

    public void setMarksObtain(int marksObtain) {
        if (marksObtain > 300)
            marksObtain = 300;
        else if (marksObtain < 0)
            marksObtain = 0;
    }

    boolean isQualified() {
        return marksObtain >= maxMarks / 10 * 4;
    }

    public String toString() {
        return "\nSubject ID : " + subID + "\nName : " + name + "\nMarks Obtained : " + marksObtain;
    }

}

public class PropertiesAndConstructors {
    public static void main(String[] args) {
        Subjects subs[] = new Subjects[3];
        subs[0]=new Subjects("s101","DS",100);
        subs[1]= new Subjects("S102","Algorithms",100);
        subs[2]= new Subjects("S103","Operating Systems",100);
        for (int i = 0; i < subs.length ; i++) {
            System.out.println(subs[i]);
            
        }
    }
}



