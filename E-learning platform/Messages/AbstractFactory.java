package Messages;

public interface AbstractFactory <T> {
    T create(String DailyNewsMessagesType);
}
