import java.util.HashMap;


public class SampleClass {

	public static void main(String[] args){
		
		HashMap map = new HashMap();
		
		map.put("hoge", new Integer(1));
		
		String foo = new String("test");
		Boolean boo = new Boolean(false);
		
		map.put(boo, foo);
		
		SampleClass sc = new SampleClass();
		
		map.put(map, sc);
		int i = 1;
		boolean t = true;
		
		map.put(i, t);
		//����̓I�[�g�{�N�V���O�@�\���g���Ă���
		//�v���~�e�B�u�^���@���b�p�[�N���X�ŕ��ŃI�[�g�{�N�V���O�����s�B
		
		System.out.println(map.get(boo));
		
		
		Object c = String.class;
		
		if(c instanceof String){
			System.out.println("String�^�̃C���X�^���X�ł��B");
		}
		if(c instanceof Class){
			System.out.println("Class�^�̃C���X�^���X�ł��B");
		}
	}
}
