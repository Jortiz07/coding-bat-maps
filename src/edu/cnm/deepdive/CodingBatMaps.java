package edu.cnm.deepdive;

import java.util.Map;

public class CodingBatMaps {

  public Map<String, String> mapAB4(Map<String, String> map) {
    if(!map.containsKey("a") || !map.containsKey("b")) {
      return map;
    }
    String a = map.get("a");
    String b = map.get("b");
    if(a.length() > b.length()) {
      map.put("c", a);
    } else if (b.length() > a.length()) {
      map.put("c", b);
    } else {
      map.put("a", "");
      map.put("b", "");
    }
    return map;
  }

}
