package Pack;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by AversiveDread on 10.06.2015.
 */
@Component
public class Message {
    LocalDateTime date;
    Contact from;
    Contact to;
    String content;
    public Message(LocalDateTime date, Contact from, Contact to, String content) {
        this.date = date;
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

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
