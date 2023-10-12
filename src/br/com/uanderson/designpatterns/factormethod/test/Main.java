package br.com.uanderson.designpatterns.factormethod.test;

import br.com.uanderson.designpatterns.factormethod.domain.gui.Window;
import br.com.uanderson.designpatterns.factormethod.domain.shape.Circle;
import br.com.uanderson.designpatterns.factormethod.domain.shape.Shape;
import br.com.uanderson.designpatterns.factormethod.domain.shape.ShapeFactory;
import br.com.uanderson.designpatterns.factormethod.domain.shape.Square;

public class Main {
    public static void main(String[] args) {
        Window w = new Window("Shapes", 300, 300);
        w.show();

        Shape shape = ShapeFactory.newShape();

        w.drawShape(shape);

        /*
            Dessa forma está muito acoplado, pois
            toda vez, que queremos desenhar um "shape", tinhamos que criar
            a instância dele na class Main e então passar para o method 'drawShape'
            ou seja a class Main era sempre modificada.

          Circle shape = new Circle();
          Square square = new Square();

          1° - Alternativa: Implementar o FactoryMethod (ler o readme.md)

                  Shape shape = ShapeFactory.newShape();

          Após essa implementação desacoplamos os objetos, eliminando a dependência,
          pois criamos uma classe ShapeFactory que possui um method static de SuperType (newShape)
          e que retorna um subType que queremos, dessa forma, alteramos somente no SuperType, é a Main
          não irá sofrer nenhuma alteração, pois não importa o que está sendo retornado.


         */
    }
}
