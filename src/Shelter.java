public class Shelter {
    public int defenseLevel;
    public int numberOfSupplies;

    public Shelter(int pDefenseLevle, int pNumberOfSupplies){
        defenseLevel = pDefenseLevle;
        numberOfSupplies = pNumberOfSupplies;
    }
    public int getDefenseLevel(){
        return defenseLevel;
    }
    public void setDefenseLevel(){

    }
    public int getNumberOfSupplies(){
        return numberOfSupplies;

    }
    public void setNumberOfSupplies(){

    }
    public void printInfo(){
        System.out.println("Defense Level: "+defenseLevel+". Number of Supplies: "+numberOfSupplies);
    }
}
