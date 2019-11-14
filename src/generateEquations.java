import java.util.Random;
public class generateEquations {
	 int  m,n;
	 int  result;
	 char sign;
	 int getRandom(){//生成随机数
		Random random=new Random();
		m=random.nextInt(101);
		n=random.nextInt(101);
		return 0;
	}
	public void calculate()
	{
		int ov;
		ov=(int)(Math.random()*2);
		if(ov==1){
			sign='+';
			result=m+n;
		}
		else{
			sign='-';
			result=m-n;
		}
	}
	public void print(int i){
		System.out.print(i+1+":"+m+sign+n+"=\t"+"\t");
	}

}
