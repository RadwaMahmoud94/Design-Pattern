package Courses;

public interface CourseProxy_Interface
{

    String name = null;
    String code = null;
    public void AddAssignment(String assignName, String assignBody);
    public void AddExam();
    public void PostGrade();
    public void PostAnnoucement();

}
