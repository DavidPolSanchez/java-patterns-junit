package com.example.structural.decoratorCustomized;

public interface Photo {

	public default Integer getBrightness(){return null; };
	public default Integer getContrast(){return null; };
	public default Integer getSaturation(){return null; };
	public default Integer getBlur(){return null; };
	public default void setBrightness(Integer brightness){};
	public default void setContrast(Integer contrast){};
	public default void setSaturation(Integer saturation){};
	public default void setBlur(Integer blur){};
	public default String show(){return "";};
	public default double cost(){return 0;};
}
