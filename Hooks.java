import io.github.sudain.Hooks.Coins


//Example:

public class CoinsUtilities{
   
   public static void AddCoins(UUID id, int Amount){
      Coins.addCoins(id, Amount);
   }
   public static void RemoveCoins(UUID id, int Amount){
      Coins.removeCoins(id, Amount);
      //Checks if the player has enough coins to be removed first. 
   }
   public static void CheckCoins(UUID id){
      int Coins = Coins.getCoins(id);
   }
   
}

