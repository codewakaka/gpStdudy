package com.gupaedu.vip.pattern.proxy.coustom;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author ：xgh
 * @description：
 * @date ：Created in 2019/8/5 21:09
 */
public class GpProxy {

    public static final String ln = "\r\n";

    public static Object newProxyInstance(GpClassLoad classLoad, Class<?>[] interfaces, GpInvocationHandler invocationHandler) {
        try {
            //动态生成源代码 。java文件
            String src = generateSrc(interfaces);
            //。java文件输出到磁盘
            String filePath = GpProxy.class.getResource("").getPath();
            System.out.println(filePath);
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();

            //把生成的，java文件编译成。class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> it = manager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, it);
            task.call();
            manager.close();

            //。class文件加载到jvm中
            Class proxyClass = classLoad.findClass("$Proxy0");
            Constructor constructor = proxyClass.getConstructor(GpInvocationHandler.class);
            boolean delete = f.delete();
            return constructor.newInstance(invocationHandler);
            //返回字节码重组以后的新的代理对象

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("package com.gupaedu.vip.pattern.proxy.coustom;" + ln);
        sb.append("import com.gupaedu.vip.pattern.proxy.statics.Person;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
        sb.append("GpInvocationHandler h;" + ln);
        sb.append("public $Proxy0(GpInvocationHandler h){" + ln);
        sb.append("this.h = h ;");
        sb.append("}" + ln);
        for (Method m : interfaces[0].getMethods()) {
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + ln);
            sb.append("try{" + ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + ln);
            sb.append("this.h.invoke(this,m,null);" + ln);
            sb.append("}catch(Throwable e){" + ln);
            sb.append("e.printStackTrace();" + ln);
            sb.append("}" + ln);
            sb.append("}" + ln);

        }
        sb.append("}" + ln);
        return sb.toString();
    }
}
