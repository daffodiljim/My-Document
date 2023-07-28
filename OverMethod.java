class OverMethod{

    public static void main(String[] args) {
       OverMethod obj = new OverMethod();
       
       obj.sum(23,45);
       obj.sum(20.5, 6.9);


    }

    void sum(double a, double b){
     System.out.println("Addition of Double type value :"+(a+b));
    }

    void sum(int a, int b){
     System.out.println("Addition od intiger type data value :"+(a+b));
    }

}