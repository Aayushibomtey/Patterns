class DiamondPattern{
    public static void main(String[] args) {
       int n=4;
        for(int i=1;i<=n;i++){
            int m=n-i;
           for(int j=1;j<=m;j++){
                                   System.out.print(" ");
}
for(int j=1;j<=2*i-1;j++){
                                   System.out.print("*");
}

           
        
                System.out.println();

        }
        
 for(int i=n;i>=1;i--){
            int m=n-i;
           for(int j=1;j<=m;j++){
                                   System.out.print(" ");
}
for(int j=1;j<=2*i-1;j++){
                                   System.out.print("*");
}

           
        
                System.out.println();

        }
    }
}