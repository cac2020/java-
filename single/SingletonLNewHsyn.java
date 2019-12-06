package mode.single;

/**
 * @Desc
 * @author wangjy15
 */
public class SingletonLNewHsyn {

	private static SingletonLNewHsyn instance = null;

	private SingletonLNewHsyn() {
	}

	/**
	 * @Desc: 锁的等待或者争抢最多发生两次，也就是同步代 码块中的代码最多被执行两次，如此一来，安全问题解决了，效率问题也被解决掉了。 
	 */
	public static synchronized SingletonLNewHsyn getInstance() {
		if (instance == null) {
			synchronized(SingletonLNewHsyn.class) {
				if (instance == null) {
					instance = new SingletonLNewHsyn();
				}
			}
		}
		return instance;
	}
}
