package algorithmpractice;
/**打印出杨辉三角形（要求打印出10行），要求等腰三角形
* */
public class YangHuiSanJiaoXing {
    public static void main(String[] args){
        yang();
    }
    public static int[][] yang(){
        int max = 10;
        int [][] result = new int[max][];
        for (int line=0; line<result.length; line++){
            for (int row=0 ; row<= line;row++){
                int num =1;
                for (int i= 1;i<=row;i++){
                    num = num * (line-i+1)/i;
                }
                 result[line][row]= num;
            }
        }
        //输出
        for (int[] a :result ) {
            for (int b : a){
                System.out.printf("%4d",b);
            }
            System.out.println();
        }
        return result;
    }
}
