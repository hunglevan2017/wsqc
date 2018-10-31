package com.saigonbpo.wsqc.Common;

import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

import java.io.File;

import java.util.List;
public class DeleteExistingSqlMapsPlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean sqlMapGenerated(GeneratedXmlFile sqlMap,
            IntrospectedTable introspectedTable)
    {
    	System.out.println(111);
    	
        String sqlMapPath = sqlMap.getTargetProject() + File.separator
                + sqlMap.getTargetPackage().replaceAll("\\.", File.separator)
                + File.separator + sqlMap.getFileName();
        File sqlMapFile = new File(sqlMapPath);

        sqlMapFile.delete();

        return true;
    }

}