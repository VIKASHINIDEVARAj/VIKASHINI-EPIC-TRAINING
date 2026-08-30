package String;

public class LongestSubString {
    public static void main(String[] args){
    String str="101011010010";
    int count=0;
    int max=0;


        for (int i = 0; i < str.length(); i++)
        {
            int sum=0;
            for (int j = i; j <str.length() ; j++)
            {
             if (str.charAt(j)=='1')
             {
                 sum+=1;
             }
             else {
                 sum-=1;
             }
                if (sum == 0)
                {
                    count=j-i+1;
                    if (count>max){
                        max=count;
                    }

                }
            }
        }
        System.out.println(max);
    }
}
