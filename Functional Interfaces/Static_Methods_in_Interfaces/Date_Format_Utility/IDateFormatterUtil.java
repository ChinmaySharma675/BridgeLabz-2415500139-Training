package Static_Methods_in_Interfaces.Date_Format_Utility;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface IDateFormatterUtil {
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}
