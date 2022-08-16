public class RectangleClass {
        private double length;
        private double width;

        public RectangleClass(double newRectangleLength, double newRectangleWidth){
            this.length = newRectangleLength;
            this.width = newRectangleWidth;
        }

        //getter
        public double getLength(){
            return length;
        }

        public double getWidth(){
            return width;
        }


        //setter
        public void setLength( int L){
            this.length = L;
        }

        public void setWidth( int W){
            this.width = W;
        }

        //override
        public String toString(){
            return "Rectangle{length: " +this.length + "width: " + this.width + '}';
        }


        public float getPerimeter(){
            return (float) (this.length + this.width) *2;
        }

        public float getArea(){
            return (float) (this.width*this.length);
        }

        public double getDiagonal(){
            return Math.sqrt((this.length * this.length) + (this.width * this.width));
        }







    }


