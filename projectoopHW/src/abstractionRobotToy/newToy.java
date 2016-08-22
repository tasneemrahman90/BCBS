package abstractionRobotToy;

public class newToy extends playToy implements myToy {
//  myToy
	 public void swimming(){
	  System.out.println("Toy robot can swim");
	 }
	  public void flying(){
		  System.out.println("Toy robot can fly");
	  }
	  
//playToy

     public void talking(){
    	 System.out.println("Toy robot can talk");
     }
     
    //newToy
     
     public void running(){
    	 System.out.println("Toy robot can run");
     }
}
     
     
     