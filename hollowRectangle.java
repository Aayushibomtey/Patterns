import java.util.*;
class hollowRectangle{
    public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
for(int i=1;i<=n;i++){
for(int j=1;j<=m;j++){
    System.out.print("*");
    if(i==1 || j==1 || i==n || j==m){
        System.out.print("*");
    }
    else{
        System.out.println(" ");
    }
}
    System.out.println();
}
    }

}