
public class GroceryItem {

    private String name;
    private double cost;

    //need the no arg constructor tecchnically

    public GroceryItem(String name,double cost){
        this.name=name;
        this.cost=cost;

    }

    //getters and setters
    
    public void setName(String newName){
        this.name=newName;
    }

    public String getName(){
        return this.name;
    }
    private void setCost(double newCost){
        this.cost=newCost;
    }
    private double getCost(){
        return this.cost;
    }

    //toString
    @Override
    public String toString(){
        return this.name+" - "+String.valueOf(this.cost);
    }

    //toStrings
}
