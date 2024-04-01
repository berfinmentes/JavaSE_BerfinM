package week04.interfaceexamples.ornek01;

import week04.interfaceexamples.ornek01.Polygon;

public  class Rectangle implements Polygon {
    @Override
    public void getArea(int length, int width) {
        System.out.println("The Area of the rectangle is "+(length*width));
    }
}
