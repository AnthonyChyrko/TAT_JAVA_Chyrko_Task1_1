package tasks.task3;

class Triangle {
	double a;
	double b;
	Triangle(){		
	}
	Triangle(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	double calcPerim() {		
		double p = a + b + Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		return p;
	}
	
	double calcSquare() {		
		double s = a*b/2;
		return s;		
	}
	
	void setA(double a){
		this.a = a;
	}
	void setB(double b){
		this.b = b;
	}
	
	double getA(){
		return this.a;		
	}
	double getB(){
		return this.b;		
	}
}
