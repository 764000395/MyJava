package 第四章.例二;

public class SwitchExample {
	private int grade;
	private char dengji;

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGrade() {
		return this.grade;
	}

	public char getDengji() {
		int forMateGrade = this.grade / 10;
		switch (forMateGrade) {
		case 10:
		case 9:
			dengji = 'A';
			break;
		case 8:
			dengji = 'B';
			break;
		case 7:
			dengji = 'C';
			break;

		case 6:
			dengji = 'D';
			break;
		default:
			dengji = 'E';
		}
		return dengji;
	}

	public void work3() {
		int[] a = new int[5];
		for (int i = 0; i < 5; i++) {
			a[i] = i + 1;
			System.out.print(a[i]);
			System.out.print("   ");
		}
		System.out.println();
		for (int i = 1; i < 5; i++) {

			for (int m = 0; m < i; m++) {
				System.out.print("  ");
			}
			int num = 5 - i;
			for (int j = 0; j < num; j++) {
				a[j] = a[j] + a[j + 1];
				System.out.print(a[j]);
				if (a[j] > 10) {
					System.out.print("  ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
