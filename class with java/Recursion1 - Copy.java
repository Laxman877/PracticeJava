import java.util.HashSet;

public class Recursion1 {
    public static void printSubseq(String str, int idx, String res, HashSet<String>allSubseq) {
        if(idx == str.length()) {
            if(allSubseq.contains(res)) {
                return;
            }
            allSubseq.add(res);
            System.out.println(res);
            return;
        }
        printSubseq(str, idx+1, res+str.charAt(idx), allSubseq);
        
        printSubseq(str, idx+1, res, allSubseq);
    }
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ccc";
        HashSet<String>allSubseq = new HashSet<>();
        printSubseq(str1, 0, "", allSubseq);        
    }
}
