import java.util.Arrays;
import java.util.List;

public class Sort {


    public static void bubbleSort(){
        int num[]={11,10,9,7,6,8,5,4,3,2,1};
        int temp=0;
        for (int i=0;i<num.length-1;i++){

            for (int j = 0; j <num.length-1; j++) {

                if(num[j]>num[j+1]){

                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }

                }
            for (int nu:num
                 ) {
                System.out.print(nu+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        bubbleSort();
        List<Integer> list= Arrays.asList(1,22,33,55,66,77,88,99,00,99,999,2,35);
        List<Integer> list1= Arrays.asList(1,22,33,55,66,77,88,99,222,333,444);
    }
}
