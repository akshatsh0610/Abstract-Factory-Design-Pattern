import java.util.Objects;

public class OnePlus
{
    private OnePlus(){};
    public static Phone getPhone(String model)
    {
        if(Objects.equals(model, "onePlus7"))
            return new Phone(model);
        else if(Objects.equals(model, "onePlus8"))
            return new Phone(model);

        return new NullPhone();
    }
}
