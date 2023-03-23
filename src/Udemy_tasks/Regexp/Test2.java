package Udemy_tasks.Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {
        String text = "должен быть текст  с почтой";
        Pattern email = Pattern.compile("\\w+@(gmail|yandex)\\.(com|ru)");
        Matcher matcher = email.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
