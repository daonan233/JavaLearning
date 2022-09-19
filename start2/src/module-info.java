import javaModule.MyService;
import javaModule.Myservice.MySeviceImpl;

module start2 {
    //模块中所有未导出的包都是模块私有的 ，他们是不能再模块之外被访问的。在start2这个模块下的描述性文件中配置模块导出
    //模块到处格式：exports 包名
    exports javaModule;

    //服务提供：provide 接口名 with 实现类
    provides MyService with MySeviceImpl;
}