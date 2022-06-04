package Users;

public class StudentBuilder implements Builder{
    String name;
    int Id;
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

    public void setId(int id) {
        Id = id;
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
}
