package graphnode;

import java.io.*;
import java.util.*;


public class G implements GNode {

    private Map<String, List<String>> map = new HashMap<String, List<String>>();
    private String mapname = "";


    public G() 
    {
      this.map = map;
    }

    public void setName(String mapname) {
      this.mapname = mapname;
    }

    public String getName() {
      return this.mapname;
    }

    public void addNode(String startnode, List<String> nodelist)
    {
      map.put(startnode,nodelist);
    }

    public void getChildren(String parent)
    {
      for (Map.Entry<String, List<String>> entry : map.entrySet()) 
      {
        String key = entry.getKey();
        if (key.equals(parent)) 
        {
          List<String> values = entry.getValue();
          System.out.print(key + ":");
          System.out.println(values);
        }
      }
    }

    public void walkGraph() 
    {

      Set set = new HashSet();
      for (Map.Entry<String, List<String>> entry : map.entrySet()) 
      {
        String key = entry.getKey();
        List<String> values = entry.getValue();
        if (!(set.contains(key)))
        {
          System.out.print(key+",");
          set.add(key);
        }
        for (String temp : values) 
        {
          if (!(set.contains(temp)))
          {
            System.out.print(temp+",");
            set.add(temp);
          }
        }
        System.out.println();

      }
    }


}