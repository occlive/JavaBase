package cc.string;

//StringBuffer
//���԰�ȫ
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ַ���������
		//ֵ���޸�
		
		StringBuffer strbuf = new StringBuffer("miomiomio");
		
		//�ַ�������
		//ֱ�Ӹ�ֵ������str = ...
		strbuf.append(strbuf);
		System.out.println(strbuf);
		
		//�ַ���ɾ��
		strbuf.delete(3,6);
		System.out.println(strbuf);
		
		//�ַ�������
		strbuf.insert(3, "������");
		System.out.println(strbuf);
		
		//�ַ�������
		strbuf.reverse();
		System.out.println(strbuf);
		
		//תΪString����
		String str = strbuf.toString();
		
		
		
	}

}
