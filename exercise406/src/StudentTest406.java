/*create a test class (StudentTest) with a main method and test the class Student:
f) Create at least three Student-objects.
g) Call all the methods you made in class Student, i.e. both
constructors, all set and get methods.
h) Print out all information of each Student-object*/


public class StudentTest406 {
    public static void main(String[] args) {
        //Student406 student1 = new Student406();
        //Student406 student2 = new Student406();
        //Student406 student3 = new Student406();

        Student406 student1 = new Student406("Adam", 'M', 1003); //setting values in brakets, no set method
        Student406 student2 = new Student406("Maria", 'F', 3698);
        Student406 student3 = new Student406("Jonas", 'M');

        student1.setName("Adam");
        student1.setGender('M');
        student1.getStudent_number();

        student2.setName("Maria");
        student2.setGender('F');
        student2.setStudent_number(10365);

        student3.setName("Sofia");
        student3.setGender('F');
        student3.setStudent_number(6598);


        System.out.println("Student 1 is: "+student1.getName() + ", "
                + student1.getGender() + ", " + student1.getStudent_number());

        System.out.println("Student 2 is: "+ student2.getName()+", "
                +student2.getGender()+", "+student2.getStudent_number());

        System.out.println("Student 3 is: "+ student3.getName()+", "+student3.getGender());
    }
// 407. b) Change the test class StudentTest so that you call method toString
//in the print-statements where you print out all information of each
//of the students.
}
