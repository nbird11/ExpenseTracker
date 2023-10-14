import java.time.format.DateTimeFormatter;

public class Constants {
    // windows32 file path
    public static String CSVFILEPATH = System.getenv("LOCALAPPDATA")
            + "\\expenses.csv";

    // .csv file header
    public static String HEADER = "Date,Debit,Credit,Where,Account,Description";

    // .csv date format
    public static DateTimeFormatter DEFAULTFORMATTER = DateTimeFormatter.ofPattern("M-d-yyyy");

}
