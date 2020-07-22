package algorithmpractice;

import org.junit.Test;

import java.util.Arrays;

public class QuickSort {
    public void sort(int[] a,int left,int right){
        int i,j,index;
        //如果left>right
        if (left>right){return;}
        i = left;
        j = right;
        //标记第一个基准点
        index = a[left];
        while (i<j){
            //从右边开始找小于index的值
            while (a[j]>=index && j>i){
                j--;
            }
            //从左边开始找大于index的值
            while (a[i] <= index && i<j){
                i++;
            }
            //符合条件时，交换a[i] a[j]的位置
            if (i<j){
                int temp = a[i];
                a[j] = a[i];
                a[i] = temp;
            }

        }
        //最后将基准数归位，交换
        a[left]= a[i];
        a[i] = index;
        //继续处理左边，这是一个递归过程
            sort(a,left,i-1);
        //继续处理右边，递归
        sort(a,i+1,right);

    }
    public void quicksort(int[] a){
        sort(a,0,a.length-1);
    }
    @Test
    public void test(){
        int[] a ={ 49, 38, 65, 97, 76, 13, 27, 49 };
        quicksort(a);
        //输出
        /*for (int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");;
        }*/
        System.out.println(Arrays.toString(a));
    }
}
