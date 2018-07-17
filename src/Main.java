public class Main {

    public static class Complex{
        double re_;
        double im_;

        Complex(Double re, Double im){
            re_ = re;
            im_ = im;
        }

        public static Complex sum(Complex c1, Complex c2){
            return new Complex(c1.re_ + c2.re_, c1.im_ + c2.im_);
        }

        public static Complex minus(Complex c1, Complex c2){
            return new Complex(c1.re_ - c2.re_, c1.im_ - c2.im_);
        }

        @Override
        public boolean equals(Object c1){
            if (!(c1 instanceof Complex)) {return false;}
            Complex c = (Complex)c1;
            if (c == this){return true;}
            if(re_ == c.re_ && im_ == c.im_){
                return true;
            }
            return false;
        }

    }

    public static void main(String[] args){


    }

}
