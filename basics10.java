
public class basics10 {
    public static void main(String[] args) {
        //break and constinue

        int n=0;

        while(true){

            if(n==3){
                n+=1;
                continue;//continue
            }
            System.out.println(n);
            n++;

            if(n==5)
            break;//break

        }
    }
}
