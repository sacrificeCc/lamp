package LampProgram.ip;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Ip {

    public static String chek(String ip) throws IOException {
        String sURL = "http://www.geoplugin.net/json.gp?ip=213.160.150.242"; //just a string
        URL url = new URL(sURL);
        URLConnection request = url.openConnection();
        request.connect();

        // обработка jsona
        JsonParser js = new JsonParser();
        JsonElement jsonFile = js.parse(new InputStreamReader((InputStream) request.getContent())); //полуаем файл из запроса
        JsonObject jsonObjJava = jsonFile.getAsJsonObject();
        String country = jsonObjJava.get("geoplugin_countryName").getAsString(); //ищем страну
        return country;
    }
}

