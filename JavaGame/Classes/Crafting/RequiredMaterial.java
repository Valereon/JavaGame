package JavaGame.Classes.Crafting;

public class RequiredMaterial {
    private String MaterialName;
    private int Amount;

    public RequiredMaterial(String MaterialName, int Amount) {
        this.MaterialName = MaterialName;
        this.Amount = Amount;
    }
    //getters and setters
    public String getMaterialName() {
        return MaterialName;
    }
    public void setMaterialName(String MaterialName) {
        this.MaterialName = MaterialName;
    }
    public int getAmount() {
        return Amount;
    }
    public void setAmount(int Amount) {
        this.Amount = Amount;
    }
    public String toString(){
        return "Material Name: " + MaterialName + " Amount: " + Amount;
    }

}
