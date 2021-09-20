package task1.IPPattern;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args)
    {
        System.out.print("Введите строку для проверки на IP адрес: ");
        boolean IP = isIP(new Scanner(System.in).nextLine());
        System.out.println("Это " + (IP ? "" : "не ") + "IP адрес");
    }

    public static boolean isIP(String str)
    {
        String ipPattern = "(([0-9][0-9]?|1[0-9]?[0-9]?|2[0-4]?[0-9]?|25[0-5]?)\\.){3}" +
                "([0-9][0-9]?|1[0-9]?[0-9]?|2[0-4]?[0-9]?|25[0-5]?)";

        return Pattern.matches(ipPattern, str);
    }
}
