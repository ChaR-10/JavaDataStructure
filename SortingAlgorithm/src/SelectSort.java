public class SelectSort {

    public static void main(String[] args) {
        //直接插入排序测试
        int[] a = {2,1,8,9,23,12,21,5};

        int[] end = SimpleSelectSort(a);



        for (int i = 0; i < end.length; ++i){
            System.out.print(end[i] + " ");
        }
    }



    /*
    ####简单选择排序####
    每一趟从待排序的记录中选出关键字最小的记录，顺序放在已排好序的子文件的最后，直到全部记录排序完毕。如对于一组关键字{K1,K2,…,Kn}，首先从K1,K2,…,Kn中选择最小值，假如它是 Kz，则将Kz与 K1对换；然后从K2，K3，…，Kn中选择最小值 Kz，再将Kz与K2对换。如此进行选择和调换n-2趟，第(n-1)趟，从Kn-1、Kn中选择最小值 Kz将Kz与Kn-1对换，最后剩下的就是该序列中的最大值，一个由小到大的有序序列就这样形成。

    稳定性
    一般认为，若是从前往后比较来选择第i小的记录则是稳定的，若是从后往前比较则不稳定。

    复杂度
    选择排序法与冒泡排序法一样，最外层循环仍然要执行n-1次，其效率仍然较差。该算法的时间复杂度为 O(n2)。

     */
    public static int[] SimpleSelectSort(int[] a){

        int k,min; //最小数下标k，值为min

        for(int i = 0; i < a.length - 1; ++i){//第i趟排序

            k = i;
            min = a[i];
            for (int j = i + 1;j < a.length; ++j){

                if(min > a[j]){
                    min = a[j];
                    k = j;
                }

            }

            if(k != i){
                a[k] = a[i];
                a[i] = min;

            }


        }

        return a;
    }




}
