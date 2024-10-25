package DailyPractise;

public class StarChar {

    public static void charRemover(String s){

        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                newString.deleteCharAt(newString.length() - 1);
            } else {
                newString.append(s.charAt(i));
            }
        }
        System.out.println(newString.toString());

    }
    public static void main(String[] args) {

        String s="leet**cod*e";
        charRemover(s);
    }
}
