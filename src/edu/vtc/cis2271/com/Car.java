/**
 * Car.java
 * Copyright 2018, Craig A. Damon
 * all rights reserved
 */
package edu.vtc.cis2271;

/**
 * Car - description
 * @author Craig A. Damon
 *
 */
public class Car
{	 
	 /**
	 * @param make
	 * @param model
	 * @param year
	 */
	public Car(CarModel makeModel, int year)
	{
		this(makeModel,year,0);
	}
	
	public Car(CarModel makeModel, int year,int mileage)
	{
		_makeModel = makeModel;
		_year = year;
		_mileage = mileage;
		_lastOilChange = mileage;
	}


	public int getYear()
	{
		return _year;
	}
	
	/**
	 * @return the make
	 */
	public String getMake()
	{
		return _makeModel.getMake();
	}

	/**
	 * @return the model
	 */
	public String getModel()
	{
		return _makeModel.getModel();
	}
	
	public boolean needsOilChange()
	{
		return _mileage >= _lastOilChange+_makeModel.recommendedOilChange();
	}
	
	public void oilChanged()
	{
		_lastOilChange = _mileage;
	}
	
	public int getOdometer()
	{
		return _mileage;
	}

	public String toString()
	{
		return this._year+" "+_makeModel;
	}
	
	public void drive(int distance)
	{
		if (distance < 0)
			return;
		this._mileage += distance;
	}

  // private final String _make;
	// private final String _model;
	private final CarModel _makeModel;
	private final int _year;
	private int _mileage;
	private int _lastOilChange;
	 

	/** description
	 * @param args
	 */
	public static void main(String[] args)
	{
		CarModel hondaAccord = new CarModel("Honda","Accord",1978,2018,2500);
		CarModel toyotaPrius = new CarModel("Toyota","Prius",2006,2018,2500);
    Car car1 = new Car(hondaAccord,2007,130000);
    Car car2 = new Car(toyotaPrius,2014,55000);
    car1.drive(1000);
    System.out.println(car1+" has "+car1.getOdometer()+" miles");
    if (car1.needsOilChange())
    	System.out.println("needs an oil change");
    else
    	System.out.println("does not need an oil change");
    car1.drive(2000);
    System.out.println(car1+" has "+car1.getOdometer()+" miles");
    if (car1.needsOilChange())
    	System.out.println("needs an oil change");
    else
    	System.out.println("does not need an oil change");
    System.out.println(car2+" has "+car2.getOdometer()+" miles");
	}

}
