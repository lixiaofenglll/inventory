package com.kade2021inventory;

import com.kade2021inventory.system.mapper.OmniMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {
    @Autowired
    OmniMapper omniMapper;

    public static void main(String[] args) {

       SpringApplication.run(ProjectApplication.class, args);
       /*OmniMapper o = run.getBean("omniMapper",OmniMapper.class);
        HashMap<String ,Object> hm = new HashMap<>();
        hm.put("_table","bug_detail,bug_project");
        HashMap<String ,Object> arg = new HashMap<>();
        arg.put("bug_project.id","bug_detail.projectId");
        hm.put("connect",arg);
        List<Map<String,Object>> re= o.selectAll(hm);
        for (Map<String ,Object> map: re
             ) {
            for (Map.Entry<String ,Object> e:map.entrySet()
                 ) {
                System.out.print(e.getKey()+":"+e.getValue()+" ");
            }
            System.out.println();
        }*/
    }

}
