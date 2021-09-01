public class SwapSort {

    public static void main(String[] args) {

        //直接插入排序测试
        int[] a = {2,1,8,9,23,12,21,5};

        int[] end = BubbleSort(a);



        for (int i = 0; i < end.length; ++i){
            System.out.print(end[i] + " ");
        }

    }


    public static int[] BubbleSort(int a[]){

        int temp;
        int flag;

        for (int i = 0; i < a.length - 1; ++i){

            flag = 0;

            for (int j = 0; j < a.length - i -1; ++j){

                if (a[j] > a[j+1]){

                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    flag = 1;

                }

            }

            if(flag == 0) //数组有序直接返回
                return a;
        }

        return a;
    }



}
