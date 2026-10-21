package classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    private static final Pattern EMAIL = Pattern.compile("^[a-z]\\.[\\w+-]+@native.semicolon.africa$");
    private static final Pattern PASSWORD = Pattern.compile("^(?!.*\\s)(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#+-]).{8,16}$");

    public static boolean isEmailValidator(String email) {
        if (email == null || email.isBlank()) {
            return false;
        }
        Pattern rule = EMAIL;
        Matcher checker = rule.matcher(email.trim());
        boolean result = checker.matches();
        return result;
    }

    public static boolean isPassword(String password) {
            if (password == null || password.isBlank()) {
                return false;
            }
            return PASSWORD.matcher(password).matches();
        }




    public static void main(String[] args) {
        System.out.println(Validation.isEmailValidator("    "));
        System.out.println(Validation.isEmailValidator(""));
        System.out.println(Validation.isEmailValidator("j.+@native.semicolon.africa"));
        System.out.println(Validation.isEmailValidator("jo.+@native.semicolon.africa"));
        System.out.println(Validation.isEmailValidator("jo.doe@dabb.hub.africa"));

        System.out.println(Validation.isPassword("theAra1@hij"));
    }


}

