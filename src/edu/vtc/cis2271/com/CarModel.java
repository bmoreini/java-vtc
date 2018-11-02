/**
 * CarModel.java
 * Copyright 2018, Craig A. Damon
 * all rights reserved
 */
package edu.vtc.cis2271;

/**
 * CarModel - description
 * @author Craig A. Damon
 *
 */
public class CarModel
{
	public CarModel(String make, String model,int year,int oilChange)
	{
		this(make,model,year,year,oilChange);
	}

	public CarModel(String make, String model,int firstYear,int lastYear,int oilChange)
	{
		_firstYear = firstYear;
		_lastYear = lastYear;
		_make = make;
		_model = model;
		_oilChange = oilChange;
	}
	
  /**
	 * @return the lastYear
	 */
	public int getLastYear()
	{
		return _lastYear;
	}
	/**
	 * @param lastYear the lastYear to set
	 */
	public void setLastYear(int lastYear)
	{
		_lastYear = lastYear;
	}
	/**
	 * @return the firstYear
	 */
	public int getFirstYear()
	{
		return _firstYear;
	}
	/**
	 * @return the make
	 */
	public String getMake()
	{
		return _make;
	}
	/**
	 * @return the model
	 */
	public String getModel()
	{
		return _model;
	}
	
	public String toString()
	{
		return _make+" "+_model;
	}
	
	public int recommendedOilChange()
	{
		return _oilChange;
	}

	private final int _firstYear;
  private int _lastYear;
  private final String _make;
  private final String _model;
  private int _oilChange;
}
