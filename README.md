##	说明：
项目由多模块构建，分为entity,dao,service,controller四个模块。其中dao模块依赖entity模块,service模块依赖dao模块,controller模块依赖service模块。

##	运行：
命令行界面进入parent下面的controller文件夹后，运行命令`mvn tomcat7:run`。在浏览器输入地址`localhost:8080`,即可进入首页。输入`localhost:8080/user/1`,会显示id为1的用户信息，可以更改为任何int数据。

##	注意：
本项目使用spring 4.2.5.RELEASE版本，如果你的本地仓库没有该版本，则需要下载所需依赖。