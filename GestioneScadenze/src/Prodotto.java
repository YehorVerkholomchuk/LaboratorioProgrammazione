import java.util.Date;
import java.util.Objects;

public abstract class Prodotto {
    private int identifier;
    private Date creationDate;

    public Prodotto(int identifier, Date creationDate) {
        this.identifier = identifier;
        this.creationDate = creationDate;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public abstract Date getExpireDate();

    public boolean isExpired(Date date) {
        if (getExpireDate().before(date)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nPRODOTTO: " +
                "\nidentifier: " + identifier +
                "\ndate of creation: " + creationDate +
                "\ndate of expiry: " + getExpireDate();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Prodotto prodotto = (Prodotto) o;
        return identifier == prodotto.identifier;
    }
}
