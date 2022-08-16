public class Circle {
        private double radius;
        public Circle(double newCircleRadius) {
            this.radius = newCircleRadius;
        }

        public double getRadius(){

            return this.radius;
        }



        public void setCircle(double radius){

            this.radius = radius;
        }


        public double getCircumference(){
            return 2 * Math.PI * this.radius ;
        }

        //override
        public String toString(){
            return "Circle{radius: " + this.radius + '}';
        }

    }

