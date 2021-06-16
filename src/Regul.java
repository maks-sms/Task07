import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regul {

    public static void main(String[] args) {
        String imput = "2020/12/23 05:30";
        String imput2 = "2020/13/77 99:99";
        String imput3 = "2020/29/39 99:99";
        String imput4 = "asdasdasd";

        exercise1(imput);
        exercise1(imput2);
        exercise1(imput3);
        exercise1(imput4);

    }


    public static void exercise1(String imput){
        /*
        ([0-9]{4})  год
        /(0[1-9]|1[0-2])    месяц
        /(0[1-9]|1[0-9]|2[0-9]|3[0-1])  дата
        \s([0-1][0-9]|2[0-3])   часы
        :([0-5][0-9])   минуты
        */
        String regex = "([0-9]{4})/(0[1-9]|1[0-2])/(0[1-9]|1[0-9]|2[0-9]|3[0-1])\\s([0-1][0-9]|2[0-3]):([0-5][0-9])";
        boolean matched = imput.matches(regex);
        System.out.println(matched);

    }
}
