# split.java


package split.java;


public class SplitJava {

    public static void main(String[] args) {
        
        String str= " Hello_Beautiful_world ";
        String Parts[] = str.split("_");
        int i;
        
        for ( i=0;i<Parts.length;i++)
        {
            System.out.println(" "+Parts[i]);
        }
       
    }
    
}
