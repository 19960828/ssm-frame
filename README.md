Spring&amp;SpringMvc&amp;Mybatis 基础框架
> ## 2019年01月04日 Version 4.2.5
+ 基于4.2.5版本的源码上进行了一些小修改：
  - 指定扫描包下，默认Action、Controller驼峰命名的类可以不使用@Controller注解就会被扫描到
  - 对于@RequestMapping 注解 进行了名称简化，可以使用@ReqMapping
  - 对于@ResponseBody 注解 进行了名称简化，可以使用@ResBody

+ 新增Mybatis 自动生成 mapper、xml、entiry 配置文件 mybatis-generator-config.xml
  - 需要 ide 安装 mybatis-generator 插件
  - 插件地址：https://dl.bintray.com/mybatis/mybatis-generator
  
+ 增加私有Maven仓库，方便对修改后的spring源码进行管理
 - 私有仓库地址：https://raw.githubusercontent.com/19960828/maven/master/
 ```
 <repository>
    <id>hjieli-core</id>
    <url>https://raw.githubusercontent.com/19960828/maven/master/</url>
</repository>
 ```

注：对于以上功能的修改，是兼容矿建自带的功能，框架之前的使用方式也是可以使用的，并不受到影响
