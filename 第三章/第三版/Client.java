package 第三章.第三版;

public class Client {
	public static void main(String[] args) {

		Scene aScene = new Scene();

		// 场景一：大象，冰箱，人

		// 赋值号左边的是抽象类或接口类型的变量，右边是具体的对象，
		// 这叫上转型，大象是一种动物，解释的通。
		// 右边是具体类必须继承左边的类或实现左边的接口
		Animal aAnimal = new Elephant();
		// 把刚生成的对象-大象，设置成Scene类中的成员变量aAnimal的值
		// 因此action()中的aAnimal就是大象，即大象进入，
		// 设置大象的高度，但Elephant中并没有setHeight方法，原因从父类中继承了父类的方法，
		// 子类若没有，就继承父类，父类中没有，子类中有的成员变量和成员方法是子类特有的，变异的
		// 父类中有，子类中方法名相同，但实现即方法体不同，叫覆盖
		aScene.setaAnimal(aAnimal);
		aAnimal.setHeight(2.0);

		Box aBox = new IceBox();
		aScene.setaBox(aBox);
		aBox.setHeight(1.9);

		Controller aController = new Person();
		aScene.setaController(aController);

		
		new Thread(aScene).start();
		// 场景二：猫，笼子，电
		//Scene aScene = new Scene();
		Animal bAnimal = new Cat();
		aScene.setaAnimal(bAnimal);
		bAnimal.setHeight(1.8);

		Box aCage = new Cage();
		aScene.setaBox(aCage);
		aCage.setHeight(1.9);

		Controller aElectricity = new Electricity();
		aScene.setaController(aElectricity);

		//for(int i=0; i<10; i++) {
			
			new Thread(aScene).start();
		

	}
}
