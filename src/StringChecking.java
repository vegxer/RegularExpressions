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
        return true;
    }

    public boolean isURL() {
        return true;
    }

    public boolean isStrongPassword() {
        return true;
    }


    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
