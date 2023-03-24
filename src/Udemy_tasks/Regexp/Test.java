package Udemy_tasks.Regexp;

public class Test {
    public static void main(String[] args) {
        /*
        \\d - одна цифра
        \\w - одна английская буква
         \\d+ 1 или более цифра
         \\d* 0 или более
         ?\\d - 0 или 1 знак до
         (x|y|z) - одна строка из множеств
         (a-zA-Z) - все английские буквы
         [0-9] - все цифры
         [^abc] - мы хотим все символы кроме а б с (исключает)
         . - любой символ
         {2} - 2 символа до (\\d{2})
         {2, } - от 2 символов  (\\d{2,})
         {2, 4} - от 2 дол 4 символов (\\d{2,4})

        */
        String a = "-1234";
        System.out.println(a.matches("(-|\\+)?\\d*"));//проверяет строку
        String d = "33dgjfjhlkdblfd23432gffdbd";
        System.out.println(d.matches("[a-zA-Z31]+\\d+"));
        String e = "helloc";
        System.out.println(e.matches("[^abc]*"));
        String url = "http://www.google.com";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        String f = "123";
        System.out.println(f.matches("\\d{2}"));
    }
}
