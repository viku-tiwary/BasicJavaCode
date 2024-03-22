import java.util.Scanner;

public class reverseString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String str = scanner.nextLine();
        String rev ="";

        //StringBuffer sb = new StringBuffer(str);
         //StringBuffer rev = sb.reverse();

          char a[] = str.toCharArray();
        int len = str.length();

        for (int i = len-1;i>=0;i--){
           rev  = rev + a[i];
        }

        /*int len = str.length();

        for (int i = len -1 ; i>=0;i--){
            rev = rev + str.charAt(i);
        }*/

        System.out.println("Your reverse String Is : " + rev);


    }
}
