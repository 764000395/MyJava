package 第三章.第五版;

public class Cat extends Animal {
	/*
	 * 对象分三种：1.纯父类对象，前提是父类不是抽象的。 2.纯子类对象。3.上转型对象。 成员分两种：1 成员边个两 2.成员方法。
	 * 成员修饰分两种：static 即类成员和非static，即实例成员
	 * 只要记住一种例外：实例方法在父类子类同名，上转型对象调用该同名方法时，调用的是子类实例方法，不是父类实例方法。
	 * 其他情形，调用的都是父类或自己类的。当然，父类对象调用的永远是父类的同名变量和方法，子类对象调用的永远是子类的同名变量和方法
	 * 
	 * static 变量或方法，父类子类同名时，上转类型对象调用的是父类的，而非static的变量父类子类同名时，
	 * 上转类型调用的也是父类的，只有非static的成员方法，
	 * 
	 */
	private static int num_cat;

	public Cat() {
		num_cat++;
	}

	public void enter() {
		// TODO Auto-generated method stub
		System.out.println("猫进入");
	}

	// @Override
	public void falseEnter() {
		// TODO Auto-generated method stub
		System.out.println("猫进不去");
	}

	public static int getNum_cat() {
		return num_cat;
	}

	public static void setNum_cat(int num_cat) {
		Cat.num_cat = num_cat;
	}

}
