//�ⲿ��
public class HelloWorld {
    
    // �ⲿ���еľ�̬����score
    private static int score = 84;
    
    // ������̬�ڲ���
	public   static       class SInner {
        // �ڲ����еı���score
        int score = 91;
        
		public void show() {
			System.out.println("�����ⲿ���е�score��" +   HelloWorld.score         );
			System.out.println("�����ڲ����е�score��" + score);
		}
	}

	// ���Ծ�̬�ڲ���
	public static void main(String[] args) {
		// ֱ�Ӵ����ڲ���Ķ���
        SInner si = new SInner();
        
        // ����show����
		si.show();
	}
}