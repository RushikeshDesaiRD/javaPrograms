class Array1{
    public static void main(String[] args) {
        int a[] = new int[100];
        int b[] = new int[100];
        for(int i=1;i<=100;i++){
            a[i] = i;
            b[i] = i;
            System.out.print(a[i] + " ");

            System.out.print(b[i] + " =");
            System.out.println(a[i] + b[i]);
            System.out.println();
        }


       
    }
}