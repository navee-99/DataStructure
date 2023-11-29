import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Searching {

    public static int binarySearch(List<Integer> list, Integer target){

        int left=0;
        int right= list.size()-1;
//        int mid
        while (left <=right){
            int mid=(left+right)/2;

            if(list.get(mid).equals(target)){
                return mid;
            }else if(list.get(mid)<target){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return -1;
    }



    public static int binaryRecursion(List<Integer> list, Integer target, Integer left, int right){
     if(left <=right) {
         int mid=(left+right)/2;
         if (list.get(mid).equals(target)) {
             return mid;
         } else if (list.get(mid) < target) {
             return  binaryRecursion(list,target,mid+1,right);
         } else {
             return  binaryRecursion(list,target,left,mid-1);
         }
     }return -1;

    }
    public static int linerSearch(List<Integer> list, Integer target){

        for (int i=0;i<list.size();i++){

            if(Objects.equals(list.get(i), target)) {
                return i;
            }
        }
        return -1;
    }

     public static void main(String[] args) {



         List<Integer> list= Arrays.asList(1,22,33,55,66,77,88,99,00,99,999,2,35);
         List<Integer> list1= Arrays.asList(1,22,33,55,66,77,88,99,222,333,444);
      System.out.println(   linerSearch(list,00));
         System.out.println(   binarySearch(list1.stream().sorted().toList(),99));

         System.out.println(binaryRecursion(list1,99,0,list1.size()-1));
    }
}
 