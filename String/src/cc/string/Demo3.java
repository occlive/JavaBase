package cc.string;

//StringBuilder
//�����԰�ȫ
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ַ�������
		// ֵ���޸�
		// �����԰�ȫ
		StringBuilder strbid = new StringBuilder("miomio");

		// �ַ�������
		// ֱ�Ӹ�ֵ������str = ...
		strbid.append(strbid);
		System.out.println(strbid);

		// �ַ���ɾ��
		strbid.delete(3, 6);
		System.out.println(strbid);

		// �ַ�������
		strbid.insert(3, "������");
		System.out.println(strbid);

		// �ַ�������
		strbid.reverse();
		System.out.println(strbid);

		// תΪString����
		String str = strbid.toString();

	}

}
