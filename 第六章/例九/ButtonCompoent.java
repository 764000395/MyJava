package 第六章.例九;//作业1：将右边的panel改成四行一列，第二行，第三行改成一行三列

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/*
 * JFrame是一个矩形窗口，里面放我们布局的图形元素。
 * java中只有两种最外的独立窗口
 * */
public class ButtonCompoent extends JFrame implements ActionListener {
	JTextArea text;
	JTextField text_name;
	JButton btn_ok;
	JRadioButton rb[];
	JCheckBox cb[];
	String str = "";

	public ButtonCompoent() {
		super("按钮组件示例");
		String[] sex = { "male", "female" };
		String[] hobbies = { "sports", "music" };

		this.setBounds(100, 100, 300, 200);// (x, y, width, high);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// 关闭时退出

		text = new JTextArea(5, 10);
		this.add(text, "West");// West中的w要大写
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 1));
		this.add(panel); // 显然在text右边

		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1, 2));
		panel1.add(new JLabel("name:"));// panel的最左边
		text_name = new JTextField(12);// 在label的右边
		panel1.add(text_name); // 显然在label右边
		panel.add(panel1);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1, 3));
		panel2.add(new JLabel("sex:"));
		ButtonGroup bg = new ButtonGroup();
		rb = new JRadioButton[sex.length];// 用字符串数组生成单选按钮数组[]
		for (int i = 0; i < sex.length; i++) { // 分别把字符串数组中的元素加到单选按钮数组中
			rb[i] = new JRadioButton(sex[i]);// 注意这里是生成数组元素，与34行区别()
			bg.add(rb[i]);
			panel2.add(rb[i]); // 注意不是add(bg)
		}
		panel.add(panel2);

		JPanel panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1, 3));
		panel3.add(new JLabel("hobbies:"));
		cb = new JCheckBox[hobbies.length];
		for (int i = 0; i < hobbies.length; i++) {
			cb[i] = new JCheckBox(hobbies[i]);
			panel3.add(cb[i]);
		}
		panel.add(panel3);

		btn_ok = new JButton("ok");
		btn_ok.addActionListener(this);// 为btn_ok添加事件监听器，本类对象this作为监听器。按钮要单击后有反应，需要这个语句
		panel.add(btn_ok);

		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {// btn_ok.addActionListener(this)之后
		// JVM要寻找该方法，该方法中为单击btn_ok后，如何反应
		if (e.getSource() == btn_ok) { // e事件对象，getSource()获取时间源
			str = str + "name:\n" + text_name.getText() + "\n sex: \n";
			for (int i = 0; i < rb.length; i++) { // 通过循环判断哪个单选按钮被选中，如果选中就获取文本
				// 单选框和复选框的事件是被选中，isSelected()
				if (rb[i].isSelected()) {
					str = str + rb[i].getText();
				}
			}
			str = str + "\n hobbies:";
			for (int i = 0; i < cb.length; i++) {
				if (cb[i].isSelected()) {
					str = str + "\n" + cb[i].getText();
				}
			}
			text.append(str);
		}

	}
}
