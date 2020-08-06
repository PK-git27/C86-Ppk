package ke0218;

public class SubCompany extends Company {

	SubCompany(String name, int number) {
		// 手动的执行父类的构造函数，因为没有无参数构造
		super(name, number);
	}

	public void query() {
		for (Employer e : employers) {
			e.show();
		}
	}

	public void query1() {
		for (int i = 0; i < employers.length; i++) {
			Employer e = employers[i];
			if (e.sex == 1) {
				e.show();
			}
		}
	}

	public void query2() {
		for (Employer e : employers) {
			if (e.sex == 0 && e.salary > 7000) {
				e.show();
			}
		}
	}

	public void addSalary(int money, Checker checker) {
		for (Employer e : employers) {
			if (checker.condition(e)) {
				e.salary += money;
				e.show();
			}
		}
	}

	public void subSalary(int money, Checker checker) {
		for (Employer e : employers) {
			if (checker.condition(e)) {
				e.salary -= money;
				e.show();
			}
		}
	}

	public static void main(String[] args) {
		SubCompany sc = new SubCompany("百度", 100);
		sc.query();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		// sc.query1();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		// sc.query2();
		System.out.println("-------------------------------------------");
		sc.addSalary(200, new ManChecker());
		System.out.println("===========================================");
		//sc.addSalary(500, new WomanChecker());

		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		sc.subSalary(2000, new OneChecker());

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		sc.addSalary(500, new JavahtmlChecker());

	}

	/**
	 * 内部类 ：男员工的检查类
	 */
	static class ManChecker implements Checker {
		public boolean condition(Employer e) {
			return e.sex == 1;
		}

	}

	/**
	 * 所有女员工，并且工资大于7000
	 * 
	 * @author pk
	 *
	 */
	static class WomanChecker implements Checker {
		public boolean condition(Employer e) {
			return e.sex == 0 && e.salary > 7000;
		}

	}

	/**
	 * 给只会一种技术的男员工 减薪
	 * 
	 * @author pk
	 *
	 */
	static class OneChecker implements Checker {
		public boolean condition(Employer e) {
			return !((e instanceof Java && e instanceof Html)||
					(e instanceof Java && e instanceof MySQL)||
					(e instanceof Html && e instanceof MySQL)||
					(e instanceof Html && e instanceof MySQL && e instanceof Java)) 
					&& e.sex==1;
		}
	}

	/**
	 * 会java 和html的女员工
	 * 
	 * @author pk
	 *
	 */
	static class JavahtmlChecker implements Checker {
		public boolean condition(Employer e) {
			return e.sex == 0 && e instanceof Java && e instanceof Html;
		}

	}
}

/**
 * 判断员工是否符合条件
 * 
 * @author pk
 *
 */
interface Checker {

	boolean condition(Employer e);
}
