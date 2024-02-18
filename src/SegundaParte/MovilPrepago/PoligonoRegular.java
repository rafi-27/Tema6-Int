package SegundaParte.MovilPrepago;

public abstract class PoligonoRegular {
        protected double tamañoLado;

        abstract double area();

        abstract int getCantidadLados();

        double perimetro() { return getCantidadLados() * this.tamañoLado;}

        public PoligonoRegular(double tamañoLado) {
            this.tamañoLado = tamañoLado;
        }
}

    class Pentagono extends PoligonoRegular {

        Pentagono(double t) {
            super(t);

        }

        @Override
        int getCantidadLados() {
            return 5;

        }

@Override double area() { return 1.72048d * Math.pow(this.tamañoLado, 2);

}

    }

    class Hexagono extends PoligonoRegular {

        Hexagono(double t) {
            super(t);

        }

        @Override
        int getCantidadLados() {
            return 6;

        }

        @Override
        double area() {
            double lado = this.tamañoLado;
            double apotema = Math.sqrt((lado * lado) - ((lado / 2) * (lado / 2)));
            return lado * apotema * 3;
        }
    }
