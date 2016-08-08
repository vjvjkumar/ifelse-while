package Pack1;
//FInd out the greatest value out 3 values?
public class IFCondition3Values {
	public static void main(String[] args) {
		int a=100;		
		int b=200;
		int c=30;
		//+ - * / 
		//< > <= >=
		//&&(ampersand)   ||(pipe symbols)		
		
		//&&: if we are  using to satisfy the both conditions then we can use &&.
		// || : if we are using one condition has to satisfy then we can use ||
		
		if(a>b && a>c){
			System.out.println("a is the greatest value: "+a);
		}else if(b>c){
			System.out.println("b is the greatest value: "+b);
		}else{
			System.out.println("c is the greatest value: "+c);
		}
	}
	


	
	
	
	

}
