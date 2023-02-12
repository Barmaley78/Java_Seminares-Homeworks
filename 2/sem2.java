public class sem2 {
public static void main(String[] args) {
    int num = 6;
    char sym1 = 'h';
    char sym2 = 'i'; 
    System.out.println(makeString(num, sym1, sym2));
    }
private static String makeString(int n, char c1, char c2){
    StringBuilder sB = new StringBuilder();
    for (int i = 0; i < n/2; i++) {
        sB.append(c1).append(c2);
    }
    return sB.toString();
}
}
