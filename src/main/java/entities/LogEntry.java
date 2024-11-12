package entities;



import java.util.Date;
import java.util.Objects;

public class LogEntry {

    private String name;
    private Date moment;

    public LogEntry(String name, Date moment) {
        this.name = name;
        this.moment = moment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        LogEntry logEntry = (LogEntry) object;
        return Objects.equals(getName(), logEntry.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}
