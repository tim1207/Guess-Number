package Java312;
//Lab1
import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		int max=99;
		int min=0;
		// generate random integers¥Í²£¶Ã¼Æ
		int x = (int) (Math.random()*100);
		System.out.println("0~99");
		while (true) {
			// user input
			if(max == min) {
				System.out.println("Game over");
				break;}
			Scanner input=new Scanner(System.in);
			System.out.println("your answer:");
			int y=input.nextInt();
		if(y==x) {
			System.out.println("correct");
			}
		else if(y>x&&y<99) {
			max=y-1;
			if(max == min) {
				System.out.println("Game over");
				break;}
			System.out.println("Too large"+(min)+"~"+(max));
			}
		else if(y<x&&y>0){
			min=y+1;
			
			if(max == min) {
				System.out.println("Game over");
				break;}
			System.out.println("Too small"+(min)+"~"+(max));
			}
		else if(y>max||y<min) {	
			System.out.println("Out of range");
			}	
		
		
		}
			
		}
	
	}

