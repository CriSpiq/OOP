import java.util.ArrayList;
import java.util.List;
public class Human {
int birth_year;
String pib,sex;
public Human(){
}
public Human(int birth_year,String pib,String sex){
	this.birth_year=birth_year;
	this.pib=pib;
	this.sex=sex;
}
public void get(){
	System.out.println("Data of birth:  "+birth_year);
	System.out.println("Name:  "+pib);
	System.out.println("Sex:  "+sex);
}

};
class Reader extends Human{
	protected int num_ticket, data_take, vnesok=100, znijka;
	String status;
	List<String> spisokKnig = new ArrayList<String>();
	
		public void AddKniga(String elemnt){
			spisokKnig.add(elemnt);
		}
		public void Znijka(){
			if(spisokKnig.size()<5) znijka=0;
			else if(spisokKnig.size()>=5 & spisokKnig.size()<10) znijka=10;
			else if(spisokKnig.size()>=10) znijka=20;
			System.out.println("znijka="+znijka);
		};
		public void RozraxZnijki(){
			vnesok-=vnesok*znijka/100;
			System.out.println("vash vnesok: "+vnesok);
		}
	
		public Reader(int num_ticket, int year, String pib, String sex, String status){
			this.num_ticket=num_ticket;
			this.status=status;
			this.birth_year=year;
			this.pib=pib;
			this.sex=sex;
		}
		public void dataTake(int day,int month,int year){
			System.out.println("Data take:"+day+"."+month+"."+year);
		}

}