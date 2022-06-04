package Messages;

public class TaskAddedFactory implements AbstractFactory{
    @Override
    public TaskAddedMessages create(String DailyNewsMessagesType)
    {
        if ("Mobile".equalsIgnoreCase(DailyNewsMessagesType)) {
            return new TaskAddedMobile();
        } else if ("Email".equalsIgnoreCase(DailyNewsMessagesType)) {
            return new TaskAddedEmail();
        }
        return null;
    }
}
