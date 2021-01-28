public class NullPointerE {
	
    public static void main(String args[]){
         try {
            String a = null; //variabel a memiliki nilai null
            // String a = "Permadi"; 
            // a tidak null
            System.out.println(a.charAt(0));
         }catch(NullPointerException e) {
             System.out.println("NullPointerException..");
         }
       }
}