package supplier;

import java.util.List;
import java.util.function.Supplier;

public class _supplier {


    static Supplier<String> getBaseUrl = () -> "Http://localhost:8080/";
    static Supplier<List<String>> getBaseUrlList = () -> List.of("Http://localhost:8080/", "Http://localhost:8081/", "Http://localhost:8082/");

    public static void main(String[] args) {
        _supplier obj = new _supplier();
        System.out.println(obj.getUrl());
        System.out.println(getBaseUrl.get());
        System.out.println(getBaseUrlList.get());
    }

    String getUrl() {
        return "Http://localhost:8080/";
    }
}
