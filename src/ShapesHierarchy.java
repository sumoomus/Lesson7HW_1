
public class ShapesHierarchy {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];

        //Initialize the array with different shapes
        shapes[0] = new Triangle(5, 8);
        shapes[1] = new Rectangle(3, 6);
        shapes[2] = new Circle(4);
        shapes[3] = new Triangle(3, 4);
        shapes[4] = new Rectangle(6, 7);

        double totalPerimeter = 0;
        //Calculate the perimeter of each shape and add it to the totalPerimeter
        for (Shape shape : shapes) {
            if (shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape;
                totalPerimeter += triangle.base + triangle.height + Math.sqrt(triangle.base * triangle.base + triangle.height * triangle.height);
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                totalPerimeter += 2 * (rectangle.length + rectangle.width);
            } else if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                totalPerimeter += 2 * Math.PI * circle.radius;
            }
        }

        System.out.println("Total Perimeter of all shapes: " + totalPerimeter);
    }
}