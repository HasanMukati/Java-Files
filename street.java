import java.util.Random;


public class street {

	
	public static void main(String []args){
		int i;
		int x = 0;
		int y = 0;
		int r = 0;
		Random ran = new Random();
		for(i=0;i<100;i++)
		{
		r = ran.nextInt(4); 
		  
		if(r == 0) 
		x--;
		else if(r == 1) 
		x++;
		else if(r == 2)
		y++;
		else 
		y--;
		  
		}
		
		System.out.printf("(%d,%d)\n",x,y);
		}
		}