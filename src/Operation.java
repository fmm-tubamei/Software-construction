import java.util.ArrayList;
public class Operation {
	public static void main(String[] args) {
		int count=0;
		int j;
		//�����ɵ���ʽ�ŵ�һ���б���
		ArrayList<generateEquations> equation=new ArrayList<generateEquations >();
		System.out.println("----------------------------------");
		System.out.println("�������50��100���ڵļӼ�����ʽ��ϰ�⣺");
		System.out.println("----------------------------------");
		for(int i=0;;i++)
		{
			generateEquations  equa=new generateEquations ();
			equa.getRandom();
			equa.calculate();
			if(equa.result>0&&equa.result<100&&count==0)
			{
				equation.add(equa);//�����ɵĵ�һ����ʽ�����б���
				count++;
			}
			else if(equa.result>0&&equa.result<100)
			{
				for(j=0;j<equation.size();j++)
				{
					//����������ͬ����ʽ
					if(equation.get(j).m!=equa.m&&equation.get(j).n!=equa.n)
						continue;
				}
				if(j>=equation.size())
				{
					equation.add(equa);
					count++;
				}
			}
			if(count==50)break;//���50��������
		}
		for(int i=0;i<50;i++)
		{
			//���50��������
			equation.get(i).print(i);
			if(i%3==0)
			System.out.println();
		}
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("���������ɵ�50��100���ڵļӼ�����Ŀ��");
		System.out.println("----------------------------------");
		for(int i=0;i<50;i++)
		{
			//���50��������Ĵ�
			System.out.print(i+1+":"+equation.get(i).result+"\t");
			if(i%3==0)
				System.out.println();
		}
	}
}
