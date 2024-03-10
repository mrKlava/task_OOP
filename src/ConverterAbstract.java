import java.util.ArrayList;

public abstract class ConverterAbstract {
    public static String toJSON(ArrayList<ArrayList<String>> data) {
        ArrayList<String> json = new ArrayList<>();

        data.forEach((item -> {
            String pair = "\"" + item.get(0) + "\":"  + " \"" + item.get(1) + "\"";
            json.add(pair);
        }));

        return "{\n" + String.join(",\n", json)  + "\n}";
    }
    public static String listToJSON(ArrayList<ArrayList<ArrayList<String>>> data) {
        ArrayList<String> json = new ArrayList<>();

        data.forEach((item -> {
            String obj = ConverterAbstract.toJSON(item);
            json.add(obj);
        }));

        return "[\n" + String.join(",\n", json)  + "\n]";
    }
    public static String toCSV(ArrayList<ArrayList<String>> data) {
        ArrayList<String> header = new ArrayList<>();
        ArrayList<String> body = new ArrayList<>();

        data.forEach((item) -> {
            header.add(item.get(0));
            body.add(item.get(1));
        });

        return String.join(",", header) + "\n" + String.join(",", body);
    }
    public static String listToCSV(ArrayList<ArrayList<ArrayList<String>>> data) {
        ArrayList<String> header = new ArrayList<>();
        ArrayList<String> body = new ArrayList<>();

        data.getFirst().forEach((item) -> {
            header.add(item.getFirst());
        });

        data.forEach((item) -> {
            ArrayList<String> line = new ArrayList<>();

            item.forEach((j)-> {
                line.add(j.get(1));
            });

            body.add(String.join(",", line));

            line.clear();
        });

        return String.join(",", header) + "\n" + String.join("\n", body);
    }
    public static String toHTML(ArrayList<ArrayList<String>> data) {
        ArrayList<String> html = new ArrayList<>();

        data.forEach((item -> {
            String el = "<h3>" + item.get(0) + ": " + item.get(1) + "</h3>";
            html.add(el);
        }));

        return "<div>\n" + String.join("\n", html) + "\n</div>";
    }
    public static String listToHTML(ArrayList<ArrayList<ArrayList<String>>> data) {
        ArrayList<String> html = new ArrayList<>();

        data.forEach((item) -> {
            ArrayList<String> li = new ArrayList<>();

            item.forEach((j) -> {
                String el = "<p>" + j.get(0) + ": " + j.get(1) + "</p>";
                li.add(el);
            });

            html.add("<li>\n" + String.join("\n", li) + "\n</li>");
            li.clear();
        });

        return "<ul>\n" + String.join("\n", html) + "\n</ul>";
    }
}