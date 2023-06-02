import java.util.Objects;

public class Apple
{
    private Apple(){};
    public static Phone  getPhone(String model)
    {
        if(Objects.equals(model, "iphone14"))
            return new Phone("iphone 14");
        else if(Objects.equals(model, "iphone14 pro"))
            return new Phone("iphone 14 pro");
        else if(Objects.equals(model, "iphone 14 pro max"))
            return new Phone("iphone 14 pro max");

        return new NullPhone();
    }
}
