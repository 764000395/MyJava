package LastYearTest.T1;

public class Scene {
	private Human aHuman;
	private Computer aComputer;
	private OperateWay aOperateWay;
	private Show aShow;

	public void setaHuman(Human aHuman) {
		this.aHuman = aHuman;
	}

	public void setaComputer(Computer aComputer) {
		this.aComputer = aComputer;
	}

	public void setaOperateWay(OperateWay aOperateWay) {
		this.aOperateWay = aOperateWay;
	}

	public void setaShow(Show aShow) {
		this.aShow = aShow;
	}

	public void action() {
		aHuman.person();
		aOperateWay.operateWay();
		aComputer.computer();
		aShow.showInfo();
	}

	public static void main(String args[]) {
		Human man = new Man();
		// Human woman = new Woman();
		Computer computerA = new NoteBookPC();
		// Computer computerB = new PadPC();
		OperateWay operateWay1 = new OperateWay1();
		// OperateWay operateWay2 = new OperateWay2();
		Show showInfo1 = new ShowInfo1();
		// Show showInfo2 = new ShowInfo2();

		// 1.
		System.out.println("场景一：");
		Scene aScene = new Scene();
		aScene.setaHuman(man);
		aScene.setaComputer(computerA);
		aScene.setaOperateWay(operateWay1);
		aScene.setaShow(showInfo1);
		aScene.action();
	}
}
