public class App {

    public static boolean setEqual(String s, String target) {
        // 1st condition: check if equal 1's and 0's
        int sZero = 0;
        int tZero = 0;
        int n = s.length();

        for (int x = 0; x <= n-1; x++) {
            if (s.charAt(x) == '0' && target.charAt(x) == '0') {
                sZero++;
                tZero++;
            } else if (s.charAt(x) == '0' && target.charAt(x) == '1') {
                sZero++;
            } else if (s.charAt(x) == '1' && target.charAt(x) == '0') {
                tZero++;
            }
        }
        //System.out.println("s zeros: " + sZero + "\n target zeros: " + tZero);

        return false;
    }

    public static void main(String[] args) throws Exception {
        String s = "1010";
        String target = "0110";

        setEqual(s, target);

        // 1st condition: check if equal 1's and 0's
        // iterate over and check if each char is equal
        // if not, choose i and j in s to make equal to target --> next iteration
        // iterate over remaining characters and check if each char is equal
        // if not, choose i and j in s to make equal to target --> next iteration......
        // return true or false
    }
}
