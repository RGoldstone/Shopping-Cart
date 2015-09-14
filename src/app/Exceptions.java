package app;

public class Exceptions {

    public boolean number(String a) {

        try {
            // System.out.println(a);
            Integer.parseInt(a); // if anything other than number entered, do
                                 // nothing go to Catch
            return true;
        } catch (NumberFormatException a1) { // avoid letter input
            return false;
        }

    }

    public boolean numberDouble(String a) {

        try {
            // System.out.println(a);
            Double.parseDouble(a); // if anything other than number entered, do
                                   // nothing go to Catch
            return true;
        } catch (NumberFormatException a1) { // avoid letter input
            return false;
        }

    }

    public boolean name(String a) {
        try {
            for (int b = 0; b < a.length(); b++) {
                if (Character.isDigit(a.charAt(b))) {
                    throw new Exception("Has a number");
                }
            }
            return true;
        } catch (Exception c) {
            return false;
        }
    }

}
