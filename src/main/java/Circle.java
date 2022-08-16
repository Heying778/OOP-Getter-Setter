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

        public void setRadius(double radius){
            this.radius = radius;
        }
        public static double getCircle(){
            return (Math.PI * this.radius* 2);

        }

    }

