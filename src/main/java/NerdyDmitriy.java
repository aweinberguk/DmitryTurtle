public class NerdyDmitriy {

    public static double max(double a, double b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;
    }

    public static int power(int a, int b) {
        int p = a;
        for (int i = 1; i < b; i++) {
            p = p * a;
        }
        return p;
    }

    public boolean isPalindrome(String a) {
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isDoubleSpace(String a) {
        for (int i = 0; i < a.length(); i++) {
            ;
        }
        return false;
    }

    public String unicharString(char c, int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += c;
        }
        return s;
    }

    public boolean isUnicharString(String a) {
        for (int i = 0; i < a.length(); i++) {
           boolean b = a.charAt(i) == a.charAt(i+1);
           return true;
        }
        return false;
    }
}