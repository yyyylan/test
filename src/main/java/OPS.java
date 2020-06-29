import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
//import java.util.stream.Collectors;
/** 获取swagger上的接口数据
* */

public class OPS {
    /**创建HttpClient实例*/
    CloseableHttpClient httpClient = HttpClients.createDefault();

    HttpGet httpGet;

    {
        httpGet = new HttpGet("http://test.mc.cmcloud.org/docs/doc.json");
    }
    //get请求



 @Test
    public void interNum()throws Exception{
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        //实例化
        String data=  EntityUtils.toString(entity);
        JsonObject returnData = new JsonParser().parse(data).getAsJsonObject();
        JsonObject paths =   returnData.getAsJsonObject("paths");
//        List<String> names = new ArrayList<>();
        List<String> names = new ArrayList<String>();
     for(Map.Entry<String,JsonElement > e: paths.entrySet()){
         names.add(e.getKey());
     }
//     List<String> names = paths.entrySet().stream().map(e -> e.getKey()).collect(Collectors.toList());
     /*for(String n : names) {
         System.out.println(n);
     }*/
     System.out.println("size " + names.size());
    }
}
