package com.ykxj.zfine.dao.mysql;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.ykxj.zfine.model.SysModule;
import com.ykxj.zfine.model.dto.Modultree;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springfox.documentation.spring.web.json.Json;

import java.util.List;

/**
 * @author JiangShengQiang
 * @date 2020/11/2 16:53
 * @desc
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ModuleTest {
    @Autowired
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


}
