package com.ogcg.encapsulation;

public class EncapsulationTest {

	  private String name;
	  public String idNum;
	  private int age;
	
	  public int getAge() {
	     return age;
	  }
	
	  public String getName() {
	     return name;
	  }
	
	
	  public void setAge( int newAge) {
	     age = newAge;
	  }
	
	  public void setName(String newName) {
	     name = newName;
	  }
		
	 
	  @Override
	  public String toString() {
	  	  // TODO Auto-generated method stub
	  	  return this.name + " : " + "Age-" + this.age + " id-" + this.idNum; 
	  }
}
