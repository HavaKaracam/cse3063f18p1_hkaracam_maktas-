public class Player {
     int id;
     int money;
     int totalDebt;
     Property property[]=new Property [60];
     int totalAssetPrice;
   public int debtToPlayers;
     int debtToBanks;
    int currentLocation;
     boolean isJail=false;
     boolean isBankruptcy=false;

    public Player(int id) {
        this.id = id;
    }
}
