package com.springboot.cart.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class AppUtils {


    /**
     * @param obj
     * @return true if value of any obj property is null, otherwise false
     */

    public static Boolean anyEmpty(Object obj) {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> mappedObj = objectMapper.convertValue(obj, Map.class);
        boolean result = false;

        List<String> idList = Arrays.asList("userId", "categoryId");

        for (String key : mappedObj.keySet()) {
            if (idList.contains(key) && mappedObj.get(key) == null) {
                continue;
            }
            if (mappedObj.get(key) == null) {
                result = true;
                break;
            }
        }

        return result;
    }


//
//    /**
//     * @param newObj - new data
//     * @param oldObj - existing data
//     * @return an Object of type oldObj
//     */
//
//    public static Object saveNewToOld(Object newObj, Object oldObj) {
//        ObjectMapper objectMapper = new ObjectMapper();
//        Map<String, Object> mappedNewObj = objectMapper.convertValue(newObj, Map.class);
//        Map<String, Object> mappedOldObj = objectMapper.convertValue(oldObj, Map.class);
//
//        for (Object key : mappedNewObj.keySet()) {
//            if (key != "id" && mappedNewObj.get(key) != null) {
//                mappedOldObj.put((String) key, mappedNewObj.get(key));
//            }
//        }
//
//        final Object obj = objectMapper.convertValue(mappedOldObj, new TypeReference<Object>() {
//        });
//
//        return obj;
//    }


}
