import java.util.Arrays;

public class ArrraysDemo {
	//Arrays��
	public static void main(String args[]) {
		
		
		//copyOf	����ĸ���
		int arr[] = {1,2,3};
		int arr2[] = new int[3];
		arr2 = Arrays.copyOf(arr, 3);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("---------------------------------");
		
		//fill  ����Ԫ�س�ʼ��
		int arr3[] = new int[5];
		Arrays.fill(arr3, 5);
		System.out.println(Arrays.toString(arr3));
		
		String strs[] = new String[5];
		Arrays.fill(strs,"hello");
		System.out.println(Arrays.toString(strs));
		
		
		System.out.println("---------------------------------");
		//sort  ��������
		int arr4[] = {1,3,6,1,3,9,3,1,6,7};
		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4));
		
		//����ascii����
		char ch[] = {'q','D','c','e','A','e','E','t','Y'};
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		
		
		System.out.println("---------------------------------");
		
		//binarySearch ���������Ԫ�صĲ���
		//���ַ�
		int index = Arrays.binarySearch(arr4, 1);
		System.out.println(index);
		int index2 = Arrays.binarySearch(arr4, 7);
		System.out.println(index2);
		int index3 = Arrays.binarySearch(arr4, 3);
		System.out.println(index3);
		
		System.out.println("---------------------------------");
		//toString һά�����ӡ
		System.out.println(Arrays.toString(arr));
		
		System.out.println("---------------------------------");
		//deepToString ��ά�����ӡ
		int arr5[][] = new int[3][3];
		System.out.println(Arrays.deepToString(arr5));
		
		System.out.println("---------------------------------");
		
	}

}
