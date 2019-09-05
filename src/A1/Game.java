package A1;

interface application{                    // Question# 5
    boolean isProcessARunning();
    boolean check_sixty_sec();
    boolean input_from_user_after_sixty();
}

public class Game {
    application a1;
    void setapp(application a1)
    {
        this.a1= a1;
    }
    void ContinuePlaying() {
        if (a1.check_sixty_sec() == true && a1.isProcessARunning() == true) {
            System.out.println("Stop wasting time");
            System.out.println("Keep playing!");
        }
    }
    void ExitGame()
    {
        if (a1.check_sixty_sec() == true && a1.isProcessARunning() == true) {
            System.out.println("Stop wasting time");
            System.out.println("Exit game!");
        }
    }
    void MakeDecision(application a1)
    {
        boolean check= a1.input_from_user_after_sixty();
        if (check==true)
        {
            ContinuePlaying();
        }
        else
        {
            ExitGame();
        }
    }
}

class application1 implements application
{
    private void SetAppListener(Game game)
    {
        game.setapp(this);
    }
    public boolean isProcessARunning(){
        return true;    //dummy process
    }
    public boolean check_sixty_sec(){
        return true;            //dummy process
    }
    public boolean input_from_user_after_sixty(){
        return false;   // dummy value, true if user wants to continue, false in case of exit.
    }
    public static void main(String[] args)
    {
        application1 a = new application1();
        Game b= new Game();
        a.SetAppListener(b);
        b.MakeDecision(a);
    }
}


