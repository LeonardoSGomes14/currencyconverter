public class Converter {

    // Setting URL
    String url_str = "https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/USD";

    // Making Request
    URL url = new URL(url_str);
    HttpURLConnection request = (HttpURLConnection) url.openConnection();
request.connect();

    // Convert to JSON
    JsonParser jp = new JsonParser();
    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
    JsonObject jsonobj = root.getAsJsonObject();

    // Accessing object
    String req_result = jsonobj.get("result").getAsString();
}
