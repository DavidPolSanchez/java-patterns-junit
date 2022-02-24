package com.example.structural.flyweight;

/*



Cuando necesitamos un gran número de objetos similares que son únicos en
 términos de sólo unos pocos parámetros y la mayoría de las cosas
 son comunes en general.

Necesitamos controlar el consumo de memoria por un gran número de objetos -
 creando menos objetos y compartiéndolos entre ellos.

 */
public class ShapeUtils {

    private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};

    public static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    public static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
