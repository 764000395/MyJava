package 第三章.第三版;

public abstract class Animal {
	private double width;
	private double height;

	// 抽象方法没有方法体。抽象类可以有抽象方法和非抽象方法
	// 抽象方法必须在其非抽象子类中实现。实现是指添加方法体。
	// 非抽象类中，不能有抽象方法。
	public abstract void animalEnter();

	public abstract void animalFalseEnter();

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
