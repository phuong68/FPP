package Lesson3_4;

public final class Circle {
	private double _radius;

	
	public double getRadius() {
		return _radius;
	}

	public Circle(double radius){
		this._radius=radius;
	}
	
	public double ComputeArea(){
			return Math.PI*_radius *_radius;
	}
}
