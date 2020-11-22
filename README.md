# springJpaGenerator
原理：
freemarker.template 模板生成

使用说明：
设置数据库链接，默认是Mysql

src/main/resources/jdbc.properties

在test里更改您的代码生成时所在的package路径

com.richcoder.code.generate.GenerateorModelTest

然后执行

com.richcoder.code.generate.GenerateorModelTest.testGenerator

您可以在下面存储模板的地方更改您的模板

resouces/template.richcoder


目前支持生成swagger,lombok

生成模块包含：controller,dao,feign,service