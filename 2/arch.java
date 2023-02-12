/*2. Напишите метод, который сжимает строку. 
Пример: вход aaaabbbcdd.
*/

public class arch {
public static void main(String[] args) {
    String inp = "aaaabbbcdd";
    System.out.println(mkString(inp));

}
private static String mkString(String s) {
    StringBuilder sB = new StringBuilder();
    s = s + ' ';
    int count = 1;
    for (int i = 0; i < s.length()-1; i++) {
        if (s.charAt(i) == s.charAt(i+1)) count++;
        else {
        sB.append(s.charAt(i)).append(count);
        count = 1;
        }
    }
    return sB.toString();
}
}
