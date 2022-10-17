package JavaGame.Classes.Crafting;
import java.util.List;


//crafting recipes for all craftable items
class CraftingRecipes{
    private String Name;
    private int RequiredLevel;
    private List<RequiredMaterial> RequiredMaterials;

    public CraftingRecipes(String Name, int RequiredLevel, List<RequiredMaterial> RequiredMaterials) {
        this.Name = Name;
        this.RequiredLevel = RequiredLevel;
        this.RequiredMaterials = RequiredMaterials;
    }
    //getters and setters
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public int getRequiredLevel() {
        return RequiredLevel;
    }
    public void setRequiredLevel(int RequiredLevel) {
        this.RequiredLevel = RequiredLevel;
    }
    public List<RequiredMaterial> getRequiredMaterials() {
        return RequiredMaterials;
    }
    public void setRequiredMaterials(List<RequiredMaterial> RequiredMaterials) {
        this.RequiredMaterials = RequiredMaterials;
    }
    public String toString(){
        return "Name: " + Name + " Required Level: " + RequiredLevel + " Required Materials: " + RequiredMaterials;
    }


}