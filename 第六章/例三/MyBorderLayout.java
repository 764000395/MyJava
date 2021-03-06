package 第六章.例三;

import javax.swing.*;

/*
 * JFrame是一个矩形窗口，里面放我们布局的图形元素。
 * java中只有两种最外的独立窗口
 * */
public class MyBorderLayout extends JFrame {
	public MyBorderLayout() {
		super("FlowLayout流布局示例");
		/*
		 * 子类构造方法调用时，自动调用父类的构造方法，这里我们认为将父类构造方法在子类构造方法中第一句。
		 * super是父类的意思。这里指JFrame。儿子不能直呼父亲的名字。必须是第一句，因为这也是调用构造方法。
		 * 调用构造方法时，类体重重新初始化，所有定义的其他东西都要重新定。 因此，如果在此句之前有其他语句，则归零。
		 * 构造方法可中可以调用其它类的构造方法，但必须是第一句，还有可以调用set方法，其他方法尽量不要调用，
		 * 因为super（）方法中有字符串参数，说明JDK中有JFrame（String aString）的构造方法定义
		 */
		this.setBounds(100, 100, 300, 200);// (x, y, width, high);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// 关闭时退出

		// FlowLayout在java.awt包中，他是从左往右自动排放
		// this.setLayout(new FlowLayout());//该句注释掉，因为JFrame默认布局管理器是边布局。
		// JFrame的默认布局是BorderLayout，即东西南北中布局。要想改布局，就用setLayout方法，
		// 在参数位置添加改后的布局管理器类的对象，即new 布局管理器类。
		this.add(new JButton("button1"), "North");// JButton也在javax.swing中，在import中，将JFrame改成*即可

		this.add(new JButton("button2"), "South");
		this.add(new JButton("button3"), "West");
		this.add(new JButton("button4"), "East");
		this.add(new JButton("button5"), "Center");

		this.setVisible(true);// 上天，下地贯穿东西左右，左边，右边不贯穿上下

	}
}
