public class ReturnTypes {

    public static void main(String[] args) {
        ReturnTypes myObject = new ReturnTypes();
    }

    public ReturnTypes(){
        System.out.println("Sum: " + add(5,8));
        System.out.println("Difference: " + subtract(10,3));
        System.out.println("Product: " + multiply(4,7));
        System.out.println("Quotient: " + divide(12,3));
        System.out.println("Remainder: " + remainder(45, 6));
        System.out.println("Exponent: " + exponent(3, 4));
    }

    public int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    public int subtract(int a, int b){
        int difference = a - b;
        return difference;
    }

    public int multiply(int a, int b){
        int product = a*b;
        return product;
    }

    public int divide(int a, int b){
        int quotient = a/b;
        return quotient;
    }

    public int remainder(int dividend, int modulus){
        return dividend % modulus;
    }

    public int exponent(int a, int b){
        int result = (int)Math.pow(a, b);
        return result;
    }

}
