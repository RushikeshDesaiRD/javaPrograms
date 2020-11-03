class Swapping{
    public static void main(String[] args) {
        int result = area(4,6);
        float result2 = area(12);
        System.out.println("Area Of Reactangle= "+ result);
        System.out.println("Area Of Circle= "+ result2);
    }
    public static int area(int num1, int num2){
        int result = num1 * num2;
        return result;
    }
    public static float area(int num1){
        return 3.14f*num1*num1;
    }
}