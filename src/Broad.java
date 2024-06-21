public class Broad
{

    private boolean isToasted; //Зазначено модифікатор private тому, що я слідкувала принципу інкапсуляції

    public Broad()
    {
        isToasted = false;
    }

    public void toastCompleted()
    {
        isToasted = true;
    }
}
