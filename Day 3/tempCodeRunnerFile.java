public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1>0 && num2>0){
            System.out.println("The point lies in first quadrant");
        }
        else if(num1<0 && num2>0){
            System.out.println("The point lies in second quadrant");
        }
        else if(num1<0 && num2<0){
            System.out.println("The point lies in third quadrant");
        } else{
            System.out.println("The point lies in fourth quadrant");
        }
        sc.close();
    }