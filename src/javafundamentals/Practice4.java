package javafundamentals;

public class Practice4 {

    public int elementCount(String s, char c) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(c)) count++;
        }

        return count;
    }

}
