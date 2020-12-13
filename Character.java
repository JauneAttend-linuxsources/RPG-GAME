public class Character {

	protected String name;
	protected Integer life;
	protected Integer power;
	protected Integer action;

	public Character (){

	}

	public Character (String name, Integer power, Integer life, Integer action){
		this.name = name;
		this.power = power;
		this.life = life;
		this.action = action;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setLife(Integer life){
		this.life = life;
	}

	public void setPower(Integer power){
		this.power = power;
	}

	public void setAction(Integer action){
		this.action = action;
	}

	public String getName(){
		return this.name;
	}

	public Integer getPower(){
		return this.power;
	}

	public Integer getAction(){
		return this.action;
	}

	public String toString(){
		return this.name;
	}

	public static void main(String [] args){

	System.out.println("hey...this is working");
	}
}
