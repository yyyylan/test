package algorithmpractice;

import javafx.scene.shape.HLineTo;
import org.junit.Test;

/**打印出杨辉三角形（要求打印出10行），要求等腰三角形
* */
public class YangHuiSanJiaoXing {

    @Test
    public void yang(){
        int max = 10;
        int [][] result = new int[max][max];
        int line;
        for (line=0; line<max; line++){
            //行
            for (int i=0 ; i<= line;i++){
                //列
                if (i == 0|| i==line) {
                    result[line][i]=1;
                } else {
                    result[line][i]= result[line-1][i-1]+result[line-1][i];
                }
            }
        }
        //等腰输出
        for (int i=0; i< line;i++){
            //下标
            int num = line -i;
            for (int j=0; j<=num; j++){
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++){
                System.out.print(result[i][k]+" ");
            }
            System.out.println();
        }
    }
}
