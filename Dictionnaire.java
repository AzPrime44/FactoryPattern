
public  class Dictionnaire extends Hacker{


    String[]  someCommonPwd ={"123456","password","12345678","qwerty","123456789","12345","1234","111111","1234567","dragon","123123","baseball","abc123","football","monkey","letmein","696969","shadow","master","666666","1qaz2wsx","7777777","fuckyou","121212","000000","qazwsx","123qwe","killer","trustno1","jordan","jennifer","zxcvbnm","asdfgh","hunter","buster","soccer","harley","batman","andrew","tigger","sunshine","iloveyou","letmein","soueid","2000","charlie","robert","thomas","hockey","ranger","daniel","starwars","klaster","112233","george","asshole","comput","michel","jessi","pepp","11","zxcv","5555","111111","1313","freed","7777","pa","fu","magg","1997","aaaa","ginger","princess","joshua","cheese","amanda","summer","love","ashley","6969","nicole","chelsea","biteme","matthew","access","yankees","987654321","dallas","austin","thunder","taylor","matrix","william","corvette","hello","martin","heather","secret","fucker","merlin","diamond","1234qwer","gfhjkm","hammer","silver","222222","88888888","anthony","justin","test","bailey","q1w2e3r4t5","patrick","internet","scooter","orange","11111","golfer","cookie","richard","samantha","bigdog","guitar","jackson","whatever","mickey","chicken","sparky","snoopy","maverick","winston","shannon","mike","toyota","blowjob","jordan23","canada","sophie","Password","apples","dick","tiger","razz","123abc","pokemon","qazxsw","55555","qwaszx","muffin","johnson","murphy","cooper","jonathan","liverpoo","david","danielle","159357","antadieng","999999999","video","stealth","shooter","nfnmzyf","hottie","browns","314159","trucks","malibu","bruins","bobcat","barbie","1964","orlando","letmein1","freaky","foobar","cthutq","baller","unicorn","scully","pussy1","potter","cookies","random","laura","hooker","dfvgbh","devildog","chipper","athena","winnie","valentina","pegasus","kristin","fetish","butterfly","woody","swinger","seattle","lonewolf","philip","gogogo","elena","country","assassin","1010","zaqwsx","testtest","peewee","moose","microsoft","teacher","sweety","stefan","stacey","shotgun","merci"};
    
  
      public void matcher(TargetAcount target){
        String reponse="noMatch";

        for ( String pwdInList : someCommonPwd) {
          
          if(target.autentify(pwdInList)) {
            reponse=pwdInList;
              System.out.println( "Password hacked with Success!!....\n");
              System.out.println( "votre mot de passe est  :" + reponse);
              break;
          }

        }
          if(reponse.equals("noMatch"))
          System.out.println( "this password doesnt exist in our database");

     }     
  
    
        
  
  }

