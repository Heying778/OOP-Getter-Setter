public class Circle {
        private double radius;
        // double radius;

        public Circle(double newCircleRadius) {
            this.radius = newCircleRadius;
        }

        public double getRadius(){
            return this.radius;
            //return radius;
        }


        // void for no return
        public void setCircle(double radius){
            this.radius = radius;
        }

        //getter
        public double getCircumference(){
            return 2 * Math.PI * this.radius;
        }

        //override
        public String toString(){
            return "Circle{radius: " + radius + '}';
        }


    }

