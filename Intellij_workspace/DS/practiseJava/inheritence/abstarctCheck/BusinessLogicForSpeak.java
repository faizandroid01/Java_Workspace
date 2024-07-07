package practiseJava.inheritence.abstarctCheck;

public class BusinessLogicForSpeak extends SpeakToAnyOne {
    @Override
    public void whyToSpeak() {
        System.out.println("Why to speak : To reconcile and recollect.");
        saySomething();
    }

    public static void main(String[] args) {
        BusinessLogicForSpeak obj = new BusinessLogicForSpeak();
        obj.whyToSpeak();
    }
}
