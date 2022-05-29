public class TargetAcount {



  private String pwd="bonjr";


  public Boolean autentify(String essaie){

    if(essaie.equals(pwd)) return true;

    return false;

  }



}
