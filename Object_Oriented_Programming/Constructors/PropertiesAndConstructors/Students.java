package Object_Oriented_Programming.Constructors.PropertiesAndConstructors;

class Students {
    private long studentNumber;
    private String studentName;

    public Students(String studentName, long studentNumber) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public String toString() {
        return "\nStudent Number : " + studentNumber + "\nStudent Name : " + studentName;
    }

    public static void main(String[] args) {
        Students Students[] = new Students[2];

        Students[0] = new Students("Ethem MERC", 220541022);
        Students[1] = new Students("Kadir MERC", 440541044);

        for (int i = 0; i < Students.length; i++) {
            System.out.println(Students[i]);

        }


    }

}




