package ua.org.crazy.homework19.task02;

public enum Sex {
    MAIL(0), FEMAIL(1);

    int hashCode;

    Sex(int hashCode) {
        this.hashCode = hashCode;
    }

    public int getHashCode() {
        return hashCode;
    }
}
