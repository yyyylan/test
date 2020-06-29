import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.security.ntlm.Client;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import sun.net.www.http.HttpClient;

import javax.swing.text.Element;
import javax.swing.text.html.parser.Entity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
public class Demo {
    CloseableHttpClient client = HttpClients.createDefault();
    HttpGet get = new HttpGet("http://test.mc.cmcloud.org/docs/doc.json");//url
    @Test
    public void e()throws Exception{
        CloseableHttpResponse response = client.execute(get);
        HttpEntity entity = response.getEntity();
        String string = EntityUtils.toString(entity);
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(string,JsonObject.class);
        JsonObject info = jsonObject.getAsJsonObject("info");
        ArrayList<String> names = new ArrayList<>();
        for (Map.Entry<String, JsonElement> e:info.entrySet()
             ) {
            names.add(e.getKey());
        }
        System.out.println(names.size());








    }



}*/
