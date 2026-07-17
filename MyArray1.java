class MyName {
    public static void main(String[] args) {

        int myarr[] = {99, 77, 66, 33, 21};

        System.out.println("First values:");
        for (int i = 0; i < myarr.length; i++) {
            System.out.println(myarr[i]);
        }

         int myarr1[]= new int[5];
        myarr1[0] = 11;
        myarr1[1] = 22;
        myarr1[2] = 33;
        myarr1[3] = 44;
        myarr1[4] = 55;

        System.out.println("New values:");
        for (int i = 0; i < myarr1.length; i++) {
            System.out.println(myarr1[i]);
        }
    }
}