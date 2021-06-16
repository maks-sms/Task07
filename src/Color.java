import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public enum Color {

    RED("#ff0000"),
    GREEN("#008000"),
    BLUE("#0000ff"),
    WHITE("#ffffff"),
    BLACK("#000000");

    private String hex;
    private int r;
    private int g;
    private int b;

    Color(String hex) {
        this.hex = hex;
        String regex = "#([0-9a-f]{2})([0-9a-f]{2})([0-9a-f]{2})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(hex);

        matcher.find();
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        String group3 = matcher.group(3);

        r = parseInt(group, 16);
        g = parseInt(group2, 16);
        b = parseInt(group3, 16);

    }

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;

        String r1 = Integer.toString(r, 16);
        String g1 = Integer.toString(g, 16);
        String b1 = Integer.toString(b, 16);

        hex = "#" + r1 + g1 + b1;
    }

}
