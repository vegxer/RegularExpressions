package tasks;

import java.util.regex.Pattern;

public class StringChecking {
    String string;

    public StringChecking(String string)
    {
        this.string = string;
    }

    public boolean isIP() {
        String ipPattern = "((0|[1-9][0-9]?|1[0-9]?[0-9]?|2[0-4]?[0-9]?|25[0-5]?)\\.){3}" +
                "(0|[1-9][0-9]?|1[0-9]?[0-9]?|2[0-4]?[0-9]?|25[0-5]?)";

        return Pattern.matches(ipPattern, string);
    }

    public boolean isGUID() {
        String guidPattern = "[0-9a-fA-F]{8}-([0-9a-fA-F]{4}-){3}[0-9a-fA-F]{12}";

        return Pattern.matches(guidPattern, string);
    }

    public boolean isURL() {
        String guidPattern = "(https?://)?(www.)?([a-zA-Z0-9][-a-zA-Z0-9]*[a-zA-Z0-9]\\.)+[\\w]{2,}";

        return Pattern.matches(guidPattern, string);
    }

    public boolean isStrongPassword() {
        String guidPattern = "(?=.{8,})((\\w*[0-9]\\w*[a-z]\\w*[A-Z]\\w*)|(\\w*[0-9]\\w*[A-Z]\\w*[a-z]\\w*)" +
                "|(\\w*[a-z]\\w*[0-9]\\w*[A-Z]\\w*)|(\\w*[a-z]\\w*[A-Z]\\w*[0-9]\\w*)" +
                "|(\\w*[A-Z]\\w*[a-z]\\w*[0-9]\\w*)|(\\w*[A-Z]\\w*[0-9]\\w*[a-z]\\w*))";

        return Pattern.matches(guidPattern, string);
    }


    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
