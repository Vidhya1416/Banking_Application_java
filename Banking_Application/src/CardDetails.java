import java.util.Calendar;

public class CardDetails {
    
    private long cardnumber;
    private int expyear;
    private int pin;
    
    public CardDetails() {
        cardnumber = 5555;
        Calendar cal = Calendar.getInstance();
        expyear = cal.get(Calendar.YEAR) + 10;
        pin = 1234; 
    }

    public long getCardNumber() {
        return cardnumber;
    }

    public int getExpYear() {
        return expyear;
    }

    public int getPin() {
        return pin;
    }

}


