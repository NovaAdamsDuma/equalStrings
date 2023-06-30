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
        //If there is an unequal amount of 1s and 0s, it is impossible to equate s to target
        if(sZero != tZero){
            return false;
        }
        // iterate over and check if each char is equal
        else{
            for (int x = 0; x <= n-1; x++) {
                char i = s.charAt(x);
                // if not, choose i and j in s to make equal to target --> next iteration
                //****************** */
                if(s.charAt(x)!=target.charAt(x)){
                    for (int y=x+1; y<n-1; y++){
                        char j = s.charAt(y);
                        if(s.charAt(y)!= s.charAt(x)){
                            s = s.replace(s.charAt(x),j);
                            s = s.replace(s.charAt(y),i);
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(s);
        return true;
        //System.out.println("s zeros: " + sZero + "\n target zeros: " + tZero);

        
    }

    public static void main(String[] args) throws Exception {
        String s = "0110";
        String target = "0101";

        System.out.println(setEqual(s, target));

        // 1st condition: check if equal 1's and 0's
        // iterate over and check if each char is equal
        
        // iterate over remaining characters and check if each char is equal
        // if not, choose i and j in s to make equal to target --> next iteration......
        // return true or false
    }
}
