public class Main{
  public static void main(String[] args) {

    ShowFeatures features = new ShowFeatures();
    //creamos nuestro Director
      Outsourcing contratista = new Outsourcing();
    // creamos los tipos de edificio disponibles para construir (posible)
      BuilderBuilding house = new BuilderHouse();
      BuilderBuilding fabrica = new BuilderIndustrial();
      BuilderBuilding centroComercial = new BuilderComercial();
    // le decimos al contratista que construya
      contratista.build(house);
      Building c = house.getBuilding();
      contratista.build(fabrica);
      Building i = fabrica.getBuilding();
      contratista.build(centroComercial);
      Building cc = centroComercial.getBuilding();
    //
      features.show(fabrica.getBuilding());
  }
}
