package Messages;

public class FactoryProvider
{
    public AbstractFactory getFactory(String choice)
    {
        if("DailyNewsMessages".equalsIgnoreCase(choice))
        {
            return new DailyNewsFactory();
        }
        else if("GradeAnnouncementMessages".equalsIgnoreCase(choice))
        {
            return new GradeAnnouncementFactory();
        }
        else if("TaskAddedMessages".equalsIgnoreCase(choice))
        {
            return new TaskAddedFactory();
        }
        return null;
    }
}
