
public class main {

	public static void main(String[] args) {
      Human obj1=new Human(1997,"Natali","FEMALE");
      System.out.println("Data of birth: "+obj1.birth_year);
      System.out.println("Name: "+obj1.pib);
      System.out.println("Sex: "+obj1.sex);
      System.out.println();
      obj1.get();     
  
      Reader obj2=new Reader(4, 2000,"Natasha","Male?","vzyav knijku");
      obj2.AddKniga("kniga1");
      obj2.AddKniga("kniga2");
      obj2.AddKniga("kniga3");
      obj2.AddKniga("kniga4");
      obj2.AddKniga("kniga5");
      obj2.Znijka();
      obj2.RozraxZnijki();
	}
   
}