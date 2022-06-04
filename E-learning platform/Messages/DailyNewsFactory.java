package Messages;

public class DailyNewsFactory implements AbstractFactory
{
    public DailyNewsMessages create(String DailyNewsMessagesType)
    {
        if ("Mobile".equalsIgnoreCase(DailyNewsMessagesType)) {
            return new DailyNewsMobile();
        } else if ("Email".equalsIgnoreCase(DailyNewsMessagesType)) {
            return new DailyNewsEmail();
        }
        return null;
    }
}
