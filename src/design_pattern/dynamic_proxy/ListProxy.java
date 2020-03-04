package design_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/**
 * 代理类
 * @param <T>
 */
public class ListProxy<T> implements InvocationHandler {
    private List<T> target;

    public ListProxy(List<T> target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object retValue = null;
        System.out.println("[" + method.getName() + ": " + args[0] + "]");
        retValue = method.invoke(target, args);
        System.out.println("[size=" + target.size() + "]");
        return retValue;
    }
}
