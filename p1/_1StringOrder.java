import java.util.*;

class _1StringOrder
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // int i  ,j , len ;
        int len = Integer.parseInt(args[0]);
        String s[] = new String[len];
        for(int i = 0 ; i <len ; i++){
            s[i] = sc.next();
        }
        sc.close(); 

        String temp = null ;

        for(int i = 0 ; i < len ; i++){
            for(int j = i+1 ; j < len ; j++){
                if(s[i].compareTo(s[j])>0){
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp ;

                }
            }
        }
        for(int i = 0; i < len; i++) {
            System.out.println(s[i]);
        }
    }
}