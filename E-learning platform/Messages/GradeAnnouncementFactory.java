package Messages;

public class GradeAnnouncementFactory implements AbstractFactory{
    public GradeAnnouncementMessages create(String DailyNewsMessagesType)
    {
        if ("Mobile".equalsIgnoreCase(DailyNewsMessagesType)) {
            return new GradeAnnouncementMobile();
        } else if ("Email".equalsIgnoreCase(DailyNewsMessagesType)) {
            return new GradeAnnouncementEmail();
        }
        return null;
    }
}
