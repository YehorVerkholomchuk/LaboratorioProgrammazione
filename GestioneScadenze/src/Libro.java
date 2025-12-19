import java.util.Date;

public class Libro extends Prodotto {
    private String title;
    private int durationDays;

    public Libro(int identifier, Date creationDate, String title, int durationDays) {
        super(identifier, creationDate);
        this.title = title;
        this.durationDays = durationDays;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    @Override
    public Date getExpireDate() {
        return getCreationDate();
    }
}
