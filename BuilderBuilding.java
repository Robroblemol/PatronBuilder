public abstract class  BuilderBuilding {
  protected Building building;

  public Building getBuilding(){
    return this.building;
  }
  public void newBuilding(){
    this.building = new Building();
  }
   public abstract void builderHeigth();
   public abstract void builderMunFloor();
   public abstract  void builderMaterialBuild();
   public abstract void builderDirBuilding();
}
