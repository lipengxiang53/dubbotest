1、启动zk客户端：bin目录下.\zkService.cmd
2、dubbo-admin的war包放置在webapp下：tomcat启动，bin目录下.\start.bat
3、provider项目启动，@Service注解标注服务，http://localhost:8088/dubbo-admin-2.5.10/下查看注册的服务
4、consumer项目启动，@Reference引用远程的服务,启动consumer项目，通过@RestController调用服务http://localhost:8085/del
5、dubbo-amin查看当前的相应的consumer以及provider