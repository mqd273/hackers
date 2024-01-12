package wang.lidong.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @Author:lidongw_1
 * @Date 2021/9/23
 * @Description: TODO
 **/
public class JobjectTest {

    public static void main(String[] args) {

        String txt = "[{\"Text\":\"您好，有电梯噢~上下楼都很方便的\",\"TextType\":1,\"Txt\":[{\"words\":\"您好，有电梯噢~上下楼都很方便的\"}]}]";


        Object parse = JSONObject.parse(txt);


        if (parse instanceof JSONObject) {

        }else if (parse instanceof  JSONArray){
            JSONObject jsonObject = ((JSONArray) parse).getJSONObject(0);
            String text = jsonObject.getString("Text");
        }

        JSONArray objects = JSONObject.parseArray(txt);

        JSONObject jsonObject = objects.getJSONObject(0);

        String text = jsonObject.getString("Text");

        System.out.printf(text);
    }
}
