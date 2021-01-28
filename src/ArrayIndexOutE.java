public class ArrayIndexOutE {
	
    public static void main(String args[]){
        try{
            int a[] = new int[6];
            a[7] = 9; // Mengakses elemen ke 8 dalam array
                // ukuran array 7
            // a[0] = 8;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Index array melebihi");
        }
    }
    
}