package com.ykxj.zfine.dao.mysql;



import com.ykxj.zfine.dao.clickhouse.UactMapper;
import com.ykxj.zfine.model.clickhouse.UactExample;
import com.ykxj.zfine.model.mysql.SysModule;
import com.ykxj.zfine.model.mysql.SysModuleExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author JiangShengQiang
 * @date 2020/11/2 16:53
 * @desc
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ModuleTest {
    /*@Autowired
    SysModuleMapper sysModuleMapper;


    @Test
    public void getModulTree(){
        List<Modultree> modultrees = sysModuleMapper.BaseResultMapTree();
        JSONArray objects = JSONUtil.parseArray(modultrees);
        System.out.println(modultrees.size());
        System.out.println(objects.toString());
    }

    @Test
    public void getModuls(){
        List<SysModule> modultrees = sysModuleMapper.getMenu("462027E0-0848-41DD-BCC3-025DCAE65555");
        System.out.println(modultrees.size());
    }
    @Test
    public void getModul(){
        SysModule sysModule = sysModuleMapper.selectByPrimaryKey("462027E0-0848-41DD-BCC3-025DCAE65555");
        System.out.println(sysModule.toString());
    }
*/

    @Autowired
    UactMapper uactMapper;

    @Autowired
    SysModuleMapper sysModuleMapper;

    @Test
    public void getModul(){
        int i = uactMapper.countByExample(new UactExample());
        System.out.println(i);



        SysModule sysModule = sysModuleMapper.selectByPrimaryKey("");
        int i1 = sysModuleMapper.countByExample(new SysModuleExample());
        System.out.println(i1);
    }

}
