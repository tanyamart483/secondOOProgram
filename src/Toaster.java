public class Toaster
{

    // Перевіряє, чи працює тостер?
    private static boolean isRun;
    // Кнопка, яка буде запускати тостер
    private Button runButton;
    private HeatSink heatSink;

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
    public static void main(String[] args) {
        // Створення об’єктів класів
    }
}


