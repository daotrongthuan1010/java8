package Pattern;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        String line = "Day la vi du ve Regex! 1000  0USD";
        String pattern = "(.*)(\\d+)(.*)";

        // Tao mot doi tuong Pattern
        Pattern r = Pattern.compile(pattern);

        // Tao doi tuong matcher.
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Gia tri duoc tim thay la: " + m.group(0) );
            System.out.println("Gia tri duoc tim thay la: " + m.group(1) );
            System.out.println("Gia tri duoc tim thay la: " + m.group(2) );
        } else {
            System.out.println("Khong co ket noi");
        }

    }
}
