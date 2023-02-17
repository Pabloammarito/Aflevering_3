


public class B {
    public static void main(String[] args) {
        String cpr = "1212091234";
        if (isValidCPR(cpr)) {
            System.out.println(cpr + " is a valid CPR number");
        } else {
            System.out.println(cpr + " is not a valid CPR number");
        }
    }

    public static boolean isValidCPR(String cprNumber) {

        if (cprNumber == null || cprNumber.length() != 10) {
            return false;
        }


        try {
            int day = Integer.parseInt(cprNumber.substring(0, 2));
            if (day <= 0 || day > 31) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;

        }

        try {
            int month = Integer.parseInt(cprNumber.substring(2, 4));
            if (month <= 0 || month > 12) {
                return false;


            }

        } catch (NumberFormatException e) {
            return false;

        }

        String controlPart = cprNumber.substring(6);
        for (int i = 0; i < controlPart.length(); i++) {
            if (!Character.isDigit(controlPart.charAt(i))) {
                return false;
            }
        }

        return true;
    }
};