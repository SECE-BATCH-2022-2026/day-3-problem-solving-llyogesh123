import java.io.*;
import java.util.*;

class String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int count = UserMainCode.countOccurances(s1, s2);
        System.out.println(count);
    }
}

class UserMainCode {
    public static int countOccurances(String s1, String s2) {
        int count = 0;
        int index = 0;

        while ((index = s1.indexOf(s2, index)) != -1) {
            count++;
            index = index + s2.length(); 
        }

        return count;
    }
}
