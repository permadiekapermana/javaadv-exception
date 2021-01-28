// class extention definisi sendiri yang merupakan sub class dari class Exception
class MyException extends Exception{
    
    // method MyException, menampilkan pesan dalam string
    public MyException(String message){
        super(message);
    }
 
}

public class NewException {

    // method select food
    public void selectFood(String food) throws MyException{
        // jika foof bernilai sate, maka jalankan Exception
        if(food.equals("sate")){
            throw new MyException("you choose wrong food");
        }
    }

    public static void main(String[] ar){
        // object exception
        NewException et = new NewException();
        // try catch exception
        try{
            et.selectFood("sate");
        }catch(MyException e){
            System.err.println(e.getMessage());
        }
        finally {
            System.out.println(et);
        }
 
        
    }

    
}
