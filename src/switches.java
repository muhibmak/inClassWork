public class switches {

    public static void main(String[] args) {

        int x = 10;

        x = (x>0) ? 100 : (x> -10) ? (x>-3) ? -2 : 6 : -5;


  //     if (x>0){
//            x = 100;
 //       }
 //       else if (x>-10){
 //           if (x>3){

 //           }
 //       }
    //    else {
  //          x=-2;
   //     }
//
       // System.out.println(x);


        x += (x>0) ? 100 : -100;

        System.out.println(x);

    }


}
