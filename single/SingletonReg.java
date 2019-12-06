package mode.single;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SingletonReg {
	// 并发线程安全
    private final static Map<String, Object> singletonObjects = new ConcurrentHashMap<String, Object>(64);

    static {
        SingletonReg singletonReg = new SingletonReg();
        singletonObjects.put(singletonReg.getClass().getName(), singletonReg);
    }

    private SingletonReg() {}

    public static SingletonReg getInstance(String name) {
        if (name == null) {
            name = "mode.single.SingletonReg";
        }
        if (singletonObjects.get(name) == null) {
            try {
                singletonObjects.put(name, Class.forName(name).newInstance());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return (SingletonReg) singletonObjects.get(name);
    }

}
