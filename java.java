package mobilepro;
import java.util.Scanner;
import java.util.*;
import java.lang.*;

class java {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
		
	try 
	{
		System.out.print("피제수를 입력하세요: ");
		String num1 = sc.nextLine();
		System.out.print("제수를 입력하세요: ");
		String num2 = sc.nextLine();
		
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		Errornum(n1,n2);
	} 
	catch (ArithmeticException e) 
	{
		System.out.println("피제수를 0으로 나눌 수는 없습니다. (" + e + ")");
	}
	catch(NumberFormatException e)
	{
    	System.out.println("입력을 잘못하셨습니다. (" + e + " )");
    }
    catch(Exception e)
	{
    	System.out.println("over 100(" + e + " )");
	}
  
    }
    public static void Errornum(int num1, int num2) throws Exception
    {
    	if(num1 >= 100 || num2 >= 100)
    	{
    	throw new Exception();
    	}
    }
    
}
	

