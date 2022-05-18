class Car{

	private int year;
	private String make;
	private double speed;
	
	Car(int year,String make, double speed){
		
		this.year = year;
		this.make = make;
		this.speed = speed;
	
	}
    
    
	public int getYear(){
	
		return year;
	}    
    
  public void setYear(int year){
  	this.year = year;
  	
  
  }
  
  public String getMake(){
	
		return make;
	}    
    
  public void setMake(String make){
  	 this.make = make;
  	
  
  }
  
  public double getSpeed(){
	
		return speed;
	}    

	public void setSpeed(double speed){
  	 this.speed = speed + 1;
  	}
 
  
    

} 




class RaceTrack{


	public static void main(String[] args){
		Car c1 = new Car(1996,"lambo",350);
		Car c2 = new Car(1998,"maclaren",349);
		Car c3 = new Car(2005,"buggati",450);
		
		
		System.out.println(c1.getYear());
		System.out.println(c1.getMake());
		System.out.println(c1.getSpeed());
		c1.accelerate();
	
	}



}






















