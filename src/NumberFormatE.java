public class NumberFormatE {
    public static void main(String args[]){
       try {
                int i = Integer.parseInt ("kkkk") ;
                // "kkkk" bukan sebuah angka

                 System.out.println(i);  
       } catch(NumberFormatException e) {
             System.out.println("NumberFormatException..");
       }
    }
}