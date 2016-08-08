package Pack1;
//Find out the greatest value out of 4 values?
public class ifCondition4Values {

	public static void main(String[] args) {
		int a=10;
		int b=400;
		int c=360;
		int d=40;
		
		if(a>b && a>c && a>d){
			System.out.println("a is the greatest value:" +a);
		}else if(b>c && b>d){
			System.out.println("b is the greatest value:" +b);
		}else if(c>d){
			System.out.println("c is the greatest value:" +c);
		}else{
			System.out.println("d is the greatest value:" +d);
			
			}
		
		

	}

}
