package mode.single;

/**
 * a>A、B线程同时进入了第一个if判断
   b>A首先进入synchronized块，由于instance为null，所以它执行instance = new Singleton();
   c>由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，并赋值给instance成员（注意此时JVM没有开始初始化这个实例），然后A离开了synchronized块。
   d>B进入synchronized块，由于instance此时不是null，因此它马上离开了synchronized块并将结果返回给调用该方法的程序。
   e>此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。
 */
public class SingletonLHNoInstRearr {

	// 以关键字volatile修饰之后，就会阻止JVM对其相关代码进行指令重排，这样就能够按照既定的顺序指执行
	private volatile static SingletonLHNoInstRearr instance = null;

	private SingletonLHNoInstRearr() {
	}

	public static synchronized SingletonLHNoInstRearr getInstance() {
		if (instance == null) {
			synchronized (SingletonLHNoInstRearr.class) {
				if (instance == null) {
					instance = new SingletonLHNoInstRearr();// 非原子操作,可能会出现指令重排优
				}
			}
		}
		return instance;
	}
}
