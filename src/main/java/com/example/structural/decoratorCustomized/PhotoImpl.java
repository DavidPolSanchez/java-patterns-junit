package com.example.structural.decoratorCustomized;

public class PhotoImpl implements Photo{
    private Integer brightness;
    private Integer contrast;
    private Integer saturation;
    private Integer blur;



    @Override
    public Integer getBrightness() {
        return brightness;
    }
    @Override
    public Integer getContrast() {
        return contrast;
    }
    @Override
    public Integer getSaturation() {
        return saturation;
    }
    @Override
    public Integer getBlur() {
        return blur;
    }
    @Override
    public void setBrightness(Integer brightness) {
        this.brightness = brightness;
    }
    @Override
    public void setContrast(Integer contrast) {
        this.contrast = contrast;
    }
    @Override
    public void setSaturation(Integer saturation) {
        this.saturation = saturation;
    }
    @Override
    public void setBlur(Integer blur) {
        this.blur = blur;
    }

}
