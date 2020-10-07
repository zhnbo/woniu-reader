package com.woniuxy;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.Scanner;

/**
 * Mybatis-Plus 代码生成器
 * @author zh_o
 * @date: 2020-10-06
 */
public class MybatisPlusCodeGenerator {

    public static void main(String[] args) {
        // 全局配置
        GlobalConfig config = new GlobalConfig();
        // 是否支持 AR 模式
        config.setActiveRecord(false);
        // 作者
        config.setAuthor("zh_o");
        // 获取项目路径
        String projectPath = System.getProperty("user.dir");
        // 设置生成路径
        config.setOutputDir(projectPath + "/src/main/java");
        // 多次生成是否文件覆盖
        config.setFileOverride(false);
        // 主键生成策略
        config.setIdType(IdType.AUTO);
        // 日期类型
        config.setDateType(DateType.ONLY_DATE);
        // Service接口名首字母是否为 I
        config.setServiceName("%sService");
        // 生成基本结果映射
        config.setBaseResultMap(true);
        // 生成基本SQL片段
        config.setBaseColumnList(true);
        // 是否打开输出目录
        config.setOpen(false);
        // 开启 Swagger2
        config.setSwagger2(true);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        // 数据库类型
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://localhost:3306/woniu_reader?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&useSSL=false")
                .setUsername("root")
                .setPassword("");

        // 策略配置
        StrategyConfig sc = new StrategyConfig();
        // 全局大写命名
        //sc.setCapitalMode(true);
        // 下划线转驼峰命名
        sc.setNaming(NamingStrategy.underline_to_camel);
        // 是否生成序列号
        sc.setEntityColumnConstant(true);
        // 是否链式实体模式
        sc.setChainModel(true);
        // 是否 rest 风格
        sc.setRestControllerStyle(true);
        // 生成的表
        sc.setInclude(scanner("表名，多个英文逗号分割").split(","));
        // 逻辑删除字段
        sc.setLogicDeleteFieldName("status");

        // 包名策略配置
        PackageConfig pc = new PackageConfig();
        // 父包
        pc.setParent("com.woniuxy.reader");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setController("controller");
        pc.setXml("mapper");

        // 整合配置
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(config).setDataSource(dsc)
                .setStrategy(sc).setPackageInfo(pc);
        // 执行
        autoGenerator.execute();

    }

    /**
     * 读取控制台内容
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + ":");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotBlank(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }
}
