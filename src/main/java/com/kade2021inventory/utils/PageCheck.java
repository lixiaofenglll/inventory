package com.kade2021inventory.utils;

import java.util.Map;

/**
 * @Auther: ZhangK
 * @DATE: 2021/3/22 15:41
 * @version: 1.0
 * @Description:
 */
public class PageCheck {
    public static void checkPage(Map<String, Object> map) {
        String page = (String)map.get("page");
        if (page != null) {
            int pageI = Integer.parseInt(page);
            int limit = Integer.parseInt((String)map.get("limit"));
            map.put("page", (pageI - 1) * limit);
        } else {
            map.put("page", 0);
            map.put("limit", 10);
        }
    }
}
