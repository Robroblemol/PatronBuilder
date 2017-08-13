public class BuilderComercial extends BuilderBuilding {
  @Override
  public void builderHeigth(){
    this.building.setHeigth(125);
  }
  @Override
  public void builderMunFloor(){
    this.building.setMunFlor(10);
  }
  public  void builderMaterialBuild (){
    this.building.setMaterialBuild("acero estructurado");
  }
  public void builderDirBuilding(){
    this.building.setDirBuilding("Zona Comercial");
  }
}
