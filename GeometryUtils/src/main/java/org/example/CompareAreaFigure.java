package org.example;

public class CompareAreaFigure {

    //Comparing shapes
    public static String getCompare(double firstFigure, double secondFigure) {
        return firstFigure < secondFigure ?
                "Площадь первой фигуры меньше второй на " + (secondFigure - firstFigure) :
                "Площадь второй фигуры меньше первой на " + (firstFigure - secondFigure);
    }


}
