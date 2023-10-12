import java.time.format.DateTimeFormatter;

public class Constants {
    public static String CSVFILEPATH = System.getenv("LOCALAPPDATA")
            + "\\expenses.csv";

    public static String HEADER = "Date,Debit,Credit,Where,Account,Description";

    public static DateTimeFormatter DEFAULTFORMATTER = DateTimeFormatter.ofPattern("M-d-yyyy");

}
