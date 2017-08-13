public class BuilderIndustrial extends BuilderBuilding {
  @Override
  public void builderHeigth(){
    this.building.setHeigth(12.5);
  }
  @Override
  public void builderMunFloor(){
    this.building.setMunFlor(5);
  }
  public  void builderMaterialBuild (){
    this.building.setMaterialBuild("Contreto");
  }
  public void builderDirBuilding(){
    this.building.setDirBuilding("Zona industrial");
  }
}
