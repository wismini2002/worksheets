package LW_02;

public class Q_01 {
    public static void main(String[] args) {
        int first=10;
        int last=49;
        int count=0;

        for(int i=first;i<=last;i++){
            System.out.print(i+" ");
            count++;

            if(count%10==0){
                System.out.println();
            }
        }
    }
}
