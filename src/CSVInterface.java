import java.util.ArrayList;

public interface CSVInterface {
    String toCSV(ArrayList<ArrayList<String>> data);
    String listToCSV(ArrayList<ArrayList<ArrayList<String>>> data);
}
