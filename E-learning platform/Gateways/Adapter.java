package Gateways;

import Messages.*;

public class Adapter implements OldGateway{
    @Override
    public void sendMessage(String notification, String user)
    {
        String[] message = notification.split(":");
        EmailGateway eg = new EmailGateway();
        SMSGateway sms = new SMSGateway();
        if (message[0] == "Assignment" || message[0] == "Exam")
        {
            FactoryProvider fp = new FactoryProvider();
            fp.getFactory("TaskAddedMessages");
            TaskAddedFactory ta = (TaskAddedFactory) fp.getFactory("TaskAddedMessages");
            TaskAddedEmail te = (TaskAddedEmail) ta.create("Email");
            eg.sendMessage(te, message[1] + " to " + user);

            TaskAddedMobile tm = (TaskAddedMobile) ta.create("Mobile");
            eg.sendMessage(tm, message[1] + " to " + user);
        }
        else if( message[0] == "Grades")
        {
            FactoryProvider fp = new FactoryProvider();
            fp.getFactory("GradeAnnouncementMessages");
            GradeAnnouncementFactory ga = (GradeAnnouncementFactory) fp.getFactory("GradeAnnouncementMessages");
            GradeAnnouncementEmail ge = (GradeAnnouncementEmail) ga.create("Email");
            eg.sendMessage(ge, message[1] + " to " + user);

            GradeAnnouncementMobile gm = (GradeAnnouncementMobile) ga.create("Mobile");
            eg.sendMessage(gm, message[1] + " to " + user);
        }
    }
}
