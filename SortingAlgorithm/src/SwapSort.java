import org.junit.Test;

public class SwapSort {

    public static void main(String[] args) {


        int[] a = {2,1,8,9,23,12,21,5};

        //int[] end = BubbleSort(a);

//        //冒泡排序测试
//        for (int i = 0; i < end.length; ++i){
//            System.out.print(end[i] + " ");
//        }

        //快速排序测试
        QuickSort(a, 0 , a.length - 1);

        for (int i = 0; i < a.length; ++i){
            System.out.print(a[i] + " ");
        }

    }


    public static int[] BubbleSort(int a[]){

        int temp;
        int flag;

        for (int i = 0; i < a.length - 1; ++i){

            flag = 0;

            for (int j = 0; j < a.length - i - 1; ++j){

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


    @Test
    public void testBubbleSort(){
        int[] a = {2, 1, 8, 9, 23, 12, 21, 5};

        //冒泡排序测试
        int[] end = BubbleSortNew(a);
        for (int i = 0; i < end.length; ++i){
            System.out.print(end[i] + " ");
        }
    }

    public static int[] BubbleSortNew(int a[]){

        int temp;
        int flag;

        for (int i = a.length - 1; i >= 1 ; --i){

            flag = 0;

            for (int j = 1; j <= i; ++j){

                if (a[j-1] > a[j]){

                    temp   = a[j-1];
                    a[j-1] = a[j];
                    a[j]   = temp;
                    flag   = 1;

                }

            }

            if(flag == 0) //数组有序直接返回
                return a;
        }

        return a;
    }


    public static void QuickSort(int[] a, int low, int high){

        int temp; //基准数
        int i = low, j = high;

        if(low < high){
            temp = a[low];
            while (i < j) {

                while (i < j && a[j] > temp) j--; //向左找比基准数小的，并交换
                if (i < j) { //向左过程，a[i]的位置一直是基准数所空下来的
                    a[i] = a[j];
                    ++i;
                }
                while (i < j && a[i] < temp) i++;//向右找比基准数大的，并交换
                if (i < j) {
                    a[j] = a[i];
                    --j;
                }
            }
            a[i] = temp;

            QuickSort(a, low, i-1);
            QuickSort(a,i+1, high);

        }



    }

}
