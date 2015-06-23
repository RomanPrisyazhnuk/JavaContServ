package Pack;
import java.time.LocalDate;

/**
 * Created by AversiveDread on 10.06.2015.
 */
public class Message {
    LocalDate time;
    Contact from;
    Contact to;
    String content;

    public LocalDate getTime() {        return time;}

    public void setTime(LocalDate time) {this.time = time;}

    public Contact getFrom() {
        return from;
    }

    public void setFrom(Contact from) {
        this.from = from;
    }

    public Contact getTo() {
        return to;
    }

    public void setTo(Contact to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
