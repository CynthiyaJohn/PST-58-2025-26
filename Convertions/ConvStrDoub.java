package PST;

public class ConvStrDoub {
	public static void main(String[] args) {

        String s = "123";
        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);      // step 3
            int digit = ch - '0';       // step 4 (ASCII logic)

            result = result * 10 + digit; // step 5
        }

        System.out.println(result);     // 123
    }
}
