

public class BruteForce extends Hacker{
 
  public void matcher(TargetAcount target){
  
      String key="",reponse="no match";
      String[] ListPwd = {"","a", "b", "c","d","e", "f", "g","h","i", "j", "k","l","m", "n", "o","p", "q", "r","s","t", "u", "v","w","x", "y", "z","A","B", "C", "D","E","F", "G", "H","I","J", "K", "L","M","N", "O", "P","Q", "R", "S","T","U", "V", "W","X","Y", "Z", "1","2","3","4", "5", "6","7", "8", "9","0","@"," ","%"};

      
      outerLoop://une etiquette comme en langage C pour sortir des boucles for imbriqués.


      for ( String place1 : ListPwd) {
        key=place1;  
        if(target.autentify(key))
         {
          reponse = key;
          break outerLoop;

          
         } 
  
        for ( String place2 : ListPwd) {
          key=place1+place2;
          if(target.autentify(key)) 
          {
            reponse = key;
            break outerLoop;

           } 
  
          for ( String place3 : ListPwd) {
            key=place1+place2+place3;
            if(target.autentify(key)) 
            {
              reponse = key;
              break outerLoop;

             } 
  
            for ( String place4 : ListPwd) {
              key=place1+place2+place3+place4;
              if(target.autentify(key))
              {
                reponse = key;
                break outerLoop;

               } 
  
              for ( String place5 : ListPwd) {
                key=place1+place2+place3+place4+place5;
                if(target.autentify(key)) 
                 {
                  reponse = key;
                  break outerLoop;

                 } 
  
                for ( String place6: ListPwd) {
                  key=place1+place2+place3+place4+place5+place6;
                  if(target.autentify(key)) 
                  {
                    reponse = key;
                    break outerLoop;

                   } 
  
                  for ( String place7 : ListPwd) {
                    key=place1+place2+place3+place4+place5+place6+place7;
                    if(target.autentify(key)) 
                    {
                      reponse = key;
                      break outerLoop;

                     } 
  
                    for ( String place8: ListPwd) {
                      key=place1+place2+place3+place4+place5+place6+place7+place8;
                      if(target.autentify(key))
                      {
                        reponse = key;
                        break outerLoop;

                       } 
                    
  
                      for ( String place9 : ListPwd) {
                        key=place1+place2+place3+place4+place5+place6+place7+place8+place9;
                        if(target.autentify(key))
                        {
                          reponse = key;
                          break outerLoop;

                         } 
  
                        for ( String place10 : ListPwd) {
                          key=place1+place2+place3+place4+place5+place6+place7+place8+place10;
                          if(target.autentify(key)) 
                          {
                            reponse = key;
                            break outerLoop;

                           } 
  
                          for ( String place11 : ListPwd) {
                            key=place1+place2+place3+place4+place5+place6+place7+place8+place9+place10+place11;
                            if(target.autentify(key)) 
                             {
                              reponse = key;
                              break outerLoop;

                             } 
  
                             for ( String place12 : ListPwd) {
                              key=place1+place2+place3+place4+place5+place6+place7+place8+place9+place10+place11+place12;
                              if(target.autentify(key))
                              {
                                reponse = key;
                                break outerLoop;

                               } 
                              // System.out.println("    "+key); 
                             
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
  
      
    }
    if(reponse.equals("no match")){

      System.out.println( "Echec....\n");
    }else{System.out.println( "Password hacked with Success!!....\n");}
    System.out.println( "votre mot de passe est  :" + reponse);
    }

}