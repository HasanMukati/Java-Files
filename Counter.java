
public class Counter {
	

	     private int count;
	     public void setcount()

	     {
	     this.count=0;
	     System.out.println("count is set to Zero");
	     }

	     public void inccount()

	     {
	    	 count++;
	     }

	     public void deccount()

	     {
	    	 if(this.count>0)
	    	 this.count=this.count-1;
	    	 else
	    	System.out.println("decrement failed: count cannot be negative");
	     }

	     public void dispcount()

	     {
	          System.out.println("count is: "+ this.count);
	     }
}