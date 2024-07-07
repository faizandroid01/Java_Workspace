package practiseJava.inheritence.abstarctCheck;

public abstract class SpeakToAnyOne extends speak {

    public abstract void whyToSpeak();

    @Override
    public void saySomething() {
            System.out.println("spoken to Anyone");
    }
}
