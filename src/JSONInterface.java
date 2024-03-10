import java.util.ArrayList;

public interface JSONInterface {
    String toJSON(ArrayList<ArrayList<String>> data);
    String listToJSON(ArrayList<ArrayList<ArrayList<String>>> data);
}

//public interface JSONInterface {
//    static String convertJSON(ArrayList<ArrayList<String>> data) {
//        return null;
//    }
//    static String convertJSONList(ArrayList<ArrayList<ArrayList<String>>> data) {
//        return null;
//    }
//}
