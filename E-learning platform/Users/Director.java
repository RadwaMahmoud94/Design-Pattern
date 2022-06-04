package Users;

public class Director
{
    public void createStudent(Builder builder, String name, String email, String phoneNumber)
    {
        builder.userType("Student");
        builder.setName(name);
        builder.setPhoneNumber(phoneNumber);
        builder.setEmail(email);
    }
    public void createProfessor(Builder builder, String name, String email, String phoneNumber)
    {
        builder.userType("Professor");
        builder.setName(name);
        builder.setPhoneNumber(phoneNumber);
        builder.setEmail(email);
    }

    public void createTA(Builder builder, String name, String email, String phoneNumber)
    {
        builder.userType("TA");
        builder.setName(name);
        builder.setPhoneNumber(phoneNumber);
        builder.setEmail(email);
    }
}
