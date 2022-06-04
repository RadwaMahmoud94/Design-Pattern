package Messages;

public class DailyNewsMobile implements DailyNewsMessages{
    @Override
    public String prepareMessages(String[] place) {
        String s = place[0]+"\n"+place[1];
        return s;
    }
}
