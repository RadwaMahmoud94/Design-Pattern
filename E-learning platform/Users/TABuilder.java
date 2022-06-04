package Users;

public class TABuilder implements Builder{
    String name;
    String department;
    String email;
    String phoneNumber;
    String type;

    @Override
    public void getUserType(String userType) {
        type = userType;
    }

    @Override
    public void userType(String userType) {
         type = userType ;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
