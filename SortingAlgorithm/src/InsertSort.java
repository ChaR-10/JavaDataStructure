import java.security.PublicKey;

public class InsertSort {

    public static void main(String[] args) {

        //直接插入排序测试
        int[] a = {2,1,8,9,23,12,21,5};

        int[] end = insertSort(a);



        for (int i = 0; i < end.length; ++i){
            System.out.print(end[i] + " ");
        }



    }

    /*
   ####1、直接插入排序####
    针对一个已排好序的序列，将待排数据插入到该序列中的合适位置，插入完成后序列依然有序。

    排序算法
    （1）从第一个元素开始，该元素可以认为已经被排序，
    （2）取出下一个元素，在已经排序的元素序列中从后向前扫描，
    （3）如果该元素（已排序）大于新元素，将该元素移到下一位置，
    （4）重复步骤3，直到找到已排序的元素小于或者等于新元素的位置，
    （5）将新元素插入到下一位置中，
    （6）重复步骤2；

    稳定性
    在插入排序中，K1是已排序部分中的元素，当K2和K1比较时，直接插到K1的后面(没有必要插到K1的前面，这样做还需要移动！！)，因此，插入排序是稳定的。

    复杂度
    一般情况下，插入排序的时间复杂度和空间复杂度分别为 O(n2 ) 和 O(1) 。
    * */

    public static int[] insertSort(int[] a){

        int i, j;//j前i后
        int temp;

        for(i = 1; i < a.length; ++i){

            temp = a[i];
            j = i - 1;

            //挪位
            while (j >= 0 && temp < a[j]){

                a[j+1] = a[j];
                --j;

            }

            //j+1处插入待排数据
            a[j+1] = temp;

        }

        return a;

    }




}
