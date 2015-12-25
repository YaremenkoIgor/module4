package Figure;

public class Triangle extends Figure {
            private double sideA;
            private double sideB;
            private double sideC;
            private double perimeter;


            boolean existence() // треугольник существует только тогда, когда любые из двух его сторон больше третьей
            {
                boolean ex = true;
                if ((sideA + sideB) < sideC || (sideA + sideC) < sideB || (sideB + sideC) < sideA)
                    ex = false;
                return ex;
            }

                @Override
                public double getArea(){
                    this.area = Math.sqrt(perimeter * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC));
                    return this.area;
                }
            }

