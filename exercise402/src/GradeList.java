import java.util.ArrayList;

public class GradeList
{
    int myint;
    private ArrayList<Grade> grades;

    public GradeList()
    {
        grades = new ArrayList<>();

    }

    public int getNumberOfGrades()
    {
        return grades.size();
    }

    public Grade getGrade(int index)
    {
        return grades.get(index);
    }

    public void setGrade(Grade grade, int index)
    {
        grades.add(index, grade);
    }

}

