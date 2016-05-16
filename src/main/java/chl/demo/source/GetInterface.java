package chl.demo.source;

import java.io.IOException;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

public class GetInterface {

    public Object getData(String url) throws IOException {
        HttpClient client = new DefaultHttpClient();
        HttpGet getMethod = new HttpGet(url);
        try{
            return client.execute(getMethod,new BasicResponseHandler());
        } finally {
            client.getConnectionManager().shutdown();
        }
    }
}
