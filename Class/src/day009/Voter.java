package day009;

public class Voter {
	private static int count;// ��Ʊ��ͳ����Ʊ��
	private int count2;// ��Ʊ��2ͳ��ÿ����Ͷ��Ʊ��
	private final static int MAX = 100; // ��Ʊ������
	private String name;// ���ͶƱ����

	// ���ι��췽��,����ͶƱ������
	public Voter(String name) {
		this.name = name;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Voter.count = count;
	}

	public int getCount2() {
		return count2;
	}

	public void setCount2(int count2) {
		this.count2 = count2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getMax() {
		return MAX;
	}

	// ����ͶƱ����
	public void vote() {

		if (count == MAX) {
			System.out.println("ͶƱ��Ѿ�����");
		} else {
			System.out.println("ͶƱ�ɹ�");

			count++;// ͶƱ�ɹ���Ʊ����1
			count2++;// ͶƱ�ɹ������Ʊ����1

			// ��һ������ʹ��������vote����,���ʾͶ������Ʊ,���Ա���
			if (count2 == 2) {
				System.out.println("�����ظ�ͶƱ");
				return;
			}
			System.out.println("Ŀǰ��Ʊ��:" + count + "Ʊ\n" + name + "ͶƱ����Ϊ"
					+ count2 + "Ʊ");
		}

	}

}
