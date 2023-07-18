package Tcs;

public class Baloon {
    public static String BA(String arr []){
        for(int i = 0; i<arr.length; i++){
            int count = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[i]==arr[j])
                    count++;
            }
            if(count %2 !=0){
                return arr[i]+" odd";
            }
    }
        return "all are even";

    }
    public static void main(String args[]) {
        String c[] = {"r", "g", "b", "b", "g", "y", "y"};
        String ans = BA(c);
        System.out.println(ans);


    }
}
