public class ShowFeatures {

  public void show(Building building){
    System.out.println("La edificacion tiene "+building.getHeigth()+" metros de alto y "+building.getMumFlor()+" pisos en total");
    System.out.println("La edificacion está construida de "+building.getmaterialBuild()+" y ubicado en "+building.getDirBuilding());
  }
}
