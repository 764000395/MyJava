package 第六章.例四;

import java.awt.*;

import javax.swing.*;

/*
 * JFrame是一个矩形窗口，里面放我们布局的图形元素。
 * java中只有两种最外的独立窗口
 * */
public class MyGridLayout extends JFrame {
	public MyGridLayout() {
		super("GridLayout格局示例");

		this.setBounds(100, 100, 300, 200);// (x, y, width, high);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// 关闭时退出

		// FlowLayout在java.awt包中，他是从左往右自动排放
		this.setLayout(new GridLayout(3, 2));
		JPanel jp1 = new JPanel();// JPanel默认是流布局，观看流布局改为三行两列格布局
		// jp1.setLayout(new GridLayout(1, 2));
		this.add(jp1); // 将jp1添加到

		JButton jb1 = new JButton("button1");
		jp1.add(jb1);
		jp1.add(new JButton("button3"));// 占用第二列

		JPanel jp2 = new JPanel();// 三行两列中的第二行
		jp2.setLayout(new BorderLayout());
		this.add(jp2);
		jp2.add(new JButton("button2"), "West");// 第一列
		jp2.add(new JButton("button4"), "East");// 第二列

		JPanel jp3 = new JPanel();
		jp3.setLayout(new GridLayout(1, 2));
		this.add(jp3);
		jp3.add(new JButton("button5"));
		jp3.add(new JButton("button6"));

		this.setVisible(true);

	}
}
