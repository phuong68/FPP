package Lesson3;

public final class Rectangle {
	private double _width;
	private double _height;

	public double getWidth() {
		return _width;
	}

	public double getHeight() {
		return _height;
	}

	public Rectangle(double width, double height) {
		this._width = width;
		this._height = height;
	}



	public double ComputeArea(){
		return _width * _height;
	}

}


