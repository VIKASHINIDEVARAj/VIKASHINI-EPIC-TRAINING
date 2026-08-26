package Array;
public class SecondLargest {
    public static void main(String[] args){
        int[] arr= {2,3,1,0,5,7,5,3,1};
        int n=arr.length;
        int pos=4;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int count=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[i-1]) {
                count++;

                if (count == pos) {
                    System.out.println(arr[i]);
                    break;
                }
            }
            }

        }

    }
































//        int first=0;
//        int second=0;
//        for (int i = 0; i < size; i++)
//        {
//            if (arr[i] > first)//12>0 56>0 21>0 88>0
//            {
//                second=first;
//                first=arr[i];
//            } else if (arr[i] > second && arr[i] != first)
//            {
//                second=arr[i];
//
//            }
//
//        }
//        if (second == 0) {
//            System.out.println("no largest");
//        }
//        else {
//            System.out.println("second largst : " + second );
//        }

