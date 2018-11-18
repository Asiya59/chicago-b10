package day_45_inheritance;

public class CybertekStudent extends Student {

	int batchID;
	
//	this vs super
//	this() vs super()
	
	public CybertekStudent() {
		super();
	}
//	this() --> it represents current class's constructor. 
	public CybertekStudent(int s) {
		this();
		batchID = s;
	}
	
}
