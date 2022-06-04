package Users;

import java.sql.Date;

public class ProfessorBuilder implements Builder{
    String name;
    String department;
    Date hirringDate;
    String PhDTopic;
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

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setHirringDate(Date hirringDate) {
        this.hirringDate = hirringDate;
    }

    public void setPhDTopic(String phDTopic) {
        PhDTopic = phDTopic;
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
