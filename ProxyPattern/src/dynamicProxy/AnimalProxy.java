package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// JDK 代理类
class AnimalProxy implements InvocationHandler {

    // 代理对象
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        // 取得代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用方法名称：" + method.getName());
        Object result = method.invoke(target, args); // 方法调用
        System.out.println("代理后完成");
        return result;
    }
}