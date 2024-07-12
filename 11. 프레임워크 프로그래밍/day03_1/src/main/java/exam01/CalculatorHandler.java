package exam01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CalculatorHandler implements InvocationHandler {

    private Object obj;

    public CalculatorHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long stime = System.nanoTime();
        try {
        Object result = method.invoke(obj, args);
        // Calculator factorial 호출, 핵심 기능 대신 수행

        return result;
    } finally {
            long etime = System.nanoTime();
            System.out.printf("걸린 시간: %d%n", etime - stime);
        }
        }
}
