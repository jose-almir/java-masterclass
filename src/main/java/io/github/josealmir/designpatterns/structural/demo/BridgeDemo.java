package io.github.josealmir.designpatterns.structural.demo;

public class BridgeDemo {
    public static void main(String[] args) {
        Painter painter = new Painter(new Canvas());
        painter.paint("red");

        EnhancedPainter enhancedPainter = new EnhancedPainter(new Canvas());
        enhancedPainter.paintScene(new String[]{"red", "green", "blue"});
    }


    interface PaintEngine {
        void paint(String color);
    }

    static class Canvas implements PaintEngine {
        @Override
        public void paint(String color) {
            System.out.println("Painting canvas with " + color);
        }
    }

    static class CSS implements PaintEngine {
        @Override
        public void paint(String color) {
            System.out.println("Painting css with " + color);
        }
    }

    static class Painter {
        private final PaintEngine engine;

        public Painter(PaintEngine engine) {
            this.engine = engine;
        }

        public void paint(String color) {
            engine.paint(color);
        }
    }

    static class EnhancedPainter extends Painter {
        public EnhancedPainter(PaintEngine engine) {
            super(engine);
        }

        public void paintScene(String[] colors) {
            for (String color : colors) {
                paint(color);
            }
        }
    }
}
