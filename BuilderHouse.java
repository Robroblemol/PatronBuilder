public class BuilderHouse extends BuilderBuilding {
  @Override
  public void builderHeigth(){
    this.building.setHeigth(2.5);
  }
  @Override
  public void builderMunFloor(){
    this.building.setMunFlor(1);
  }
  public  void builderMaterialBuild (){
    this.building.setMaterialBuild("Madera");
  }
  public void builderDirBuilding(){
    this.building.setDirBuilding("Zona Residencial");
  }
}
