public class Toaster
{

    // Перевіряє, чи працює тостер?
    private static boolean isRun; //Зазначено модифікатор private тому, що я слідкувала принципу інкапсуляції
    // Кнопка, яка буде запускати тостер
    private Button runButton; //Зазначено модифікатор private тому, що я слідкувала принципу інкапсуляції
    private HeatSink heatSink; //Зазначено модифікатор private тому, що я слідкувала принципу інкапсуляції

    public Toaster()
    {
        runButton = new Button();
        heatSink = new HeatSink();
        isRun = false;
    }

    public void runToaster()
    {
        if (!isRun)
        {
            isRun = runButton.pressTheButton();
        }
    }

    public Broad toastTheBroad(Broad broad)
    {
        broad = new Broad();
        if (isRun)
        {
            heatSink.warmUp();
            broad.toastCompleted();
        }

        return broad;
    }
    public static void main(String[] args)
    {
        Toaster toaster = new Toaster(); // Створення об’єктів класів
    }
}


