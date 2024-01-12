package wang.lidong.tools;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;

/**
 * @Author:lidongw_1
 * @Date 2021/11/23
 * @Description: TODO
 **/
public class SQLBuilder {

    public static void main(String[] args) throws FileNotFoundException {

       // File file = new File("");
       // FileInputStream fs = new FileInputStream(file);

        String s = "{\"masterHotelid\":80144192,\"isOversea\":false}";

        GetIMClientAuthorityV2ResponseType getIMClientAuthorityV2ResponseType = JSON.parseObject(s, GetIMClientAuthorityV2ResponseType.class);



        System.out.println("EBK".startsWith(null));
    }


    static class GetIMClientAuthorityV2ResponseType implements Serializable {

        /**
         * 是否支持聊天
         */
        private List<IMClientAuthorityV2> imclientauthority;

        @Data
        public static class  IMClientAuthorityV2{

            /**
             * 母酒店ID
             */
            private Long masterhotelid;

            /**
             * 是否海外
             */
            private Boolean isOversea;

            /**
             * 国内酒店开通则为EBK;
             * 未开通则为NONE;
             * 海外酒店EBK开通则为EBK；
             * EMAIL开通则为EMAIL;
             * 两者全开则为BOTH ；
             * 均为开通则为NONE
             */
            private String openStatus;

        }


    }
}
