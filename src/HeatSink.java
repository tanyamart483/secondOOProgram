public class HeatSink
{
    private static double temperature;

    public HeatSink()
    {
        temperature = 0.0;
    }

    public static double getTemperature()
    {
        return temperature;
    }

    // Нагріватись
    public void warmUp()
    {
        temperature += 5; // Цельсія
    }

    // Охолонути
    public void coolDown()
    {
        temperature -= 5;
    }
}
