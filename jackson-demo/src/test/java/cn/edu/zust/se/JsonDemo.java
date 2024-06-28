package cn.edu.zust.se;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

/**
 * @Author: ShenYi
 * @Date: 2024-06-28-22:29
 * @Description:
 */
public class JsonDemo {
    @Test
    public void test(){
        String json = "{\"username\":\"tom\",\"company\":{\"companyName\":\"中华\",\"address\":\"北京\"},\"cars\":[\"奔驰\",\"宝马\"]}";
        String arrayJson = "[{\"number\":64,\"result\":\"SUCCESS\"},{\"number\":65,\"result\":\"FAILURE\"},{\"number\":66,\"result\":\"ABORTED\"},{\"number\":67,\"result\":\"SUCCESS\"}]";
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            JsonNode jsonNode=objectMapper.readTree(json);
            JsonNode path = jsonNode.path("username");
            JsonNode resultValue = jsonNode.findValue("username");
            JsonNode resultPath = jsonNode.findPath("username");
            System.out.println(path.toString());
            System.out.println(resultPath.toString());
            System.out.println(resultValue.toString());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
