package mode.builder;

public class Test {

	public static void main(String[] args) {
		User u = new User.Builder().setName("bob").setAge(22).build();
		System.out.println(u);
	}

}
