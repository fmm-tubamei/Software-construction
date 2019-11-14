import java.util.ArrayList;
public class Operation {
	public static void main(String[] args) {
		int count=0;
		int j;
		//将生成的算式放到一个列表里
		ArrayList<generateEquations> equation=new ArrayList<generateEquations >();
		System.out.println("----------------------------------");
		System.out.println("程序输出50道100以内的加减法算式的习题：");
		System.out.println("----------------------------------");
		for(int i=0;;i++)
		{
			generateEquations  equa=new generateEquations ();
			equa.getRandom();
			equa.calculate();
			if(equa.result>0&&equa.result<100&&count==0)
			{
				equation.add(equa);//将生成的第一个算式放入列表里
				count++;
			}
			else if(equa.result>0&&equa.result<100)
			{
				for(j=0;j<equation.size();j++)
				{
					//不能生成相同的算式
					if(equation.get(j).m!=equa.m&&equation.get(j).n!=equa.n)
						continue;
				}
				if(j>=equation.size())
				{
					equation.add(equa);
					count++;
				}
			}
			if(count==50)break;//完成50道计算题
		}
		for(int i=0;i<50;i++)
		{
			//输出50道计算题
			equation.get(i).print(i);
			if(i%3==0)
			System.out.println();
		}
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println("下面是生成的50到100以内的加减法题目：");
		System.out.println("----------------------------------");
		for(int i=0;i<50;i++)
		{
			//输出50道计算题的答案
			System.out.print(i+1+":"+equation.get(i).result+"\t");
			if(i%3==0)
				System.out.println();
		}
	}
}
