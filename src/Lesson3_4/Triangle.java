package Lesson3_4;

public final class Triangle {
	
	private double _height;
	private double _base;
	
	
	public double getHeight() {
		return _height;
	}

	public double getBase() {
		return _base;
	}

	public Triangle(double _height, double _base) {
		
		this._height = _height;
		this._base = _base;
	}



	public double ComputeArea(){
		return (this._base * this._height)/2;
	}

}
