package rohit;

public class S07_StrBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<26; i++) {
            char ch = (char)('a'  + i);
            builder.append(ch);  // it adds the char into existing builder object instead of creating new object
        }
        System.out.println(builder.toString());

        builder.deleteCharAt(0); // deletes 0 index character
    }
}
