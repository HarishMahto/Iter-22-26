

public class q04 {
    static char[] characters = {'c','a','r','b','o','n'};
    static char[] charac= {'c','a','r'};
    public static void main(String[] args) {
        printPermutation(charac,0, charac.length);
    }
   
    private static void printPermutation(char[] a, int startIndex, int endIndex) {
        if (startIndex == endIndex)//reached end of recursion, print the state of a
            System.out.println(new String(a));
        else {
            //try to move the swap window from start index to end index
            //i.e 0 to a.length-1
            for (int x = startIndex; x < endIndex; x++) {
                swap(a, startIndex, x);
                printPermutation(a, startIndex + 1, endIndex);
                swap(a, startIndex, x);
            }
        }
    }
   
    private static void swap(char[] a, int i, int x) {
        char t = a[i];
        a[i] = a[x];
        a[x] = t;
    }
}
