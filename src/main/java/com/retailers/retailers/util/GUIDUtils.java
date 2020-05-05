package com.retailers.retailers.util;

import java.util.UUID;

/**
 * @author PC
 * @data 2020/5/5
 */
public class GUIDUtils {
    public static String getGuid(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
