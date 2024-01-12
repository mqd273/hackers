//package com.tujia.ccs.provider.table;
//
//
//
//import java.util.List;
//
///**
// * @Author:lidongw_1
// * @Date 2020/4/26
// * @Description: TODO
// **/
//public class CalculateTableConversation {
//
//    public static void main(String[] args) {
//
//        List<String> s = Lists.newArrayList();
//        s.add("645116466962346048,129929");
//        for (String item : s) {
//            String[] split = item.split(",");
//
//             System.out.println(String.format("SELECT 'conversation_adapter_%s' as tablename, t.* FROM conversation_adapter_%s t WHERE t.conversation_id =%s ",(Math.abs(Long.parseLong(split[1]))%256 + 1),(Math.abs(Long.parseLong(split[1]))%256 + 1),split[0]));
//            // System.out.println(String.format("DELETE FROM conversation_adapter_%s  WHERE conversation_id =%s ; ",(Math.abs(Long.parseLong(split[1]))%256 + 1),split[0]));
//           //System.out.println(String.format("DELETE FROM conversation_hotel_map_%s WHERE conversation_id =%s ; ",(Math.abs(Long.valueOf(split[1]).hashCode())%256 + 1),split[0]));
//
//            // System.out.println("union all");
//        }
//
//       // aaaa();
//
//    }
//
//    private static void aaaa() {
//    /*  for (int i = 1; i < 257; i++) {
//          System.out.println(String.format("SELECT 'conversation_hotel_map_%s' as tableName, t.conversation_id,count(*) FROM conversation_hotel_map_%s t group by t.conversation_id having count(*) > 1 ",i,i));
//          System.out.println("UNION ALL");
//      }*/
//
//        List<String> s = Lists.newArrayList();
//        s.add("577396163046214336,4152884");
//        s.add("577396163046214336,5822860");
//        s.add("573320055220799616,1060626");
//        s.add("573320055220799616,3986312");
//        s.add("573325844417285056,1011758");
//        s.add("573325844417285056,6226389");
//        s.add("573326168922196416,158611");
//        s.add("573326168922196416,2268702");
//        s.add("573325127073860096,177441");
//        s.add("573325127073860096,208965");
//        s.add("565691282400938496,2681128");
//        s.add("565691282400938496,5228343");
//        s.add("571661906139089856,103203");
//        s.add("571661906139089856,5836076");
//        s.add("573325356837832896,1039332");
//        s.add("573325356837832896,1071042");
//        s.add("573325138700470336,1071042");
//        s.add("573325138700470336,6025363");
//        s.add("573323311007337216,43351");
//        s.add("573323311007337216,217332");
//        s.add("573323569426795456,1060626");
//        s.add("573323569426795456,2516012");
//        s.add("573323305974172416,182613");
//        s.add("573323305974172416,5353321");
//        s.add("573325133868632896,2469826");
//        s.add("573325133868632896,2560770");
//        s.add("573323747030403136,5837399");
//        s.add("573323747030403136,6258540");
//        s.add("573325151300159616,88523");
//        s.add("573325151300159616,5160842");
//        s.add("573314718589717376,1029533");
//        s.add("573314718589717376,1710095");
//        s.add("578010878562732736,90061");
//        s.add("578010878562732736,146773");
//
//
//        for (String item : s) {
//            String[] split = item.split(",");
//
//           // System.out.println(String.format("SELECT 'conversation_adapter_%s' as tablename, t.* FROM conversation_adapter_%s t WHERE t.conversation_id =%s ",(Math.abs(Long.parseLong(split[1]))%256 + 1),(Math.abs(Long.parseLong(split[1]))%256 + 1),split[0]));
//           // System.out.println(String.format("DELETE FROM conversation_adapter_%s  WHERE conversation_id =%s ; ",(Math.abs(Long.parseLong(split[1]))%256 + 1),split[0]));
//            System.out.println(String.format("DELETE FROM conversation_hotel_map_%s WHERE conversation_id =%s ; ",(Math.abs(Long.valueOf(split[1]).hashCode())%256 + 1),split[0]));
//
//           // System.out.println("union all");
//        }
//
//        System.out.println("-------------------------------------------------------------");
//        // List<Long> conversationList = Lists.newArrayList(573323747030403136L,573325138700470336L,559897689346218112L,573320055220799616L,573325151300159616L,573325356837832896L,559869862722869632L,573325352710638016L,573326168922196416L,565691282400938496L,573325127073860096L,577396163046214336L,578010878562732736L,573323305974172416L,573323311007337216L,573325133868632896L,573314718589717376L,571661906139089856L,573323569426795456L,573325844417285056L);
//        List<Long> conversationList = Lists.newArrayList(573325352710638016L);
//        for (Long aLong : conversationList) {
//            Long l = Long.valueOf(aLong);
//            int hc = l.hashCode();
//            //System.out.println(i);
///*            File fl = new File("");
//            try {
//                FileReader fr = new FileReader(fl);
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }*/
//
//            System.out.println(String.format("SELECT * FROM conversation_adapter_%s t WHERE t.conversation_id =%s;",(Math.abs(hc)%256 + 1),l));
//            //System.out.println( l+ ":" + (Math.abs(i)%256 + 1));
//        }
//
//        Long hoteId = Long.valueOf("5067238");
//        int j = hoteId.hashCode();
//        System.out.println("hotel: " + (Math.abs(j)%256 + 1));
//    }
//}
