package day009;

public class TestVoter {

	public static void main(String[] args) {

		//������������
		Voter zhang = new Voter("����");
		//ͶƱ
		zhang.vote();
		
		Voter li = new Voter("����");
		li.vote();
		
		Voter wang = new Voter("����");
		wang.vote();

		//ѭ������97��������i,ÿ������ʹ��һ��ͶƱ����
		for (int i = 1; i <= 97; i++) {
			Voter voter = new Voter("��" + i);
			voter.vote();
		}
		
		//��101��ͶƱ��ʾ���ͶƱ����
		Voter voter = new Voter("��98");
		voter.vote();

	}

}
