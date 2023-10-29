public class TowerOfHanoi {
    public static void Tower(int n,String src,String Helper,String Dest){
        if(n==1){
            System.out.println("Disc "+n+" is transferred from "+src +" to "+Dest);
            return;
        }
        Tower(n-1,src,Dest,Helper);
        System.out.println("Disc "+n+" is transferred from "+src +" to "+Dest);
        Tower(n-1,Helper,src,Dest);
    }
    public static void main(String[] args) {
        int n=4;
        Tower(n,"S","H","D");

    }
}
