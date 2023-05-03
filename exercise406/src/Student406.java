




// Three instance variables: a name (String), a gender (char - then
// when you create objects in the main method use the values ‘M’ or
//‘F’), and a student number (int).

public class Student406 {
    private String name;
    private char gender;
    private int student_number;

    // b) A 3-argument constructor setting all three instance variables.
    public Student406(String name, char gender, int student_number) {
        this.name = name;
        this.gender = gender;
        this.student_number = student_number;

    }
    // c) A 2-argument constructor with a name and a gender as argument.
    // Assume that the student number is 0 if not set.

    public Student406(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }
    // d) Set methods for name. Call the methods
    //setName.

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
//   d) Set methods  student number. Call the method

    public void setStudent_number(int student_number) {
        this.student_number = student_number;
    }

    public int getStudent_number() {
        return student_number;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

/*Modify class Student :
a) Add a method toString() that return a String with all information
of a Student-object. As an example calling the method toString()
on a Student-object with name = “Bob”, gender = ‘M’ and student
number = 2342 could return the following string: “Bob, ‘M’,
2342”. */


}