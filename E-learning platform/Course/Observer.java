package Courses;
import Courses.Course;
import Users.Professor;
import Users.Student;
import Users.TA;

public abstract class Observer
{
    Professor pr;
    TA ta;
    Student st;

    protected Course course;
    public abstract void update();
}
