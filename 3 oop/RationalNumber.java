package lab03;
public class RationalNumber {
//³í³ö³àë³çàö³ÿ çì³ííèõ
	int numerator, denominator;
//êîíñòðóêòîðè
	public RationalNumber() {
		this.numerator=1;
		this.denominator=1;
	}
	public RationalNumber(int numerator, int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
	}
//çíàõîääæåííÿ íàéá³ëüøîãî ñï³ëüíîãî ä³ëüíèêà
	public static int gcd(int a, int b) {
		while (a!=0 && b!=0){
		    if (a>b)
		        a=a%b;
		    else
		        b=b%a;
		}
		if(a>b) return a;
		else return b;
	}
//äîäàâàííÿ äâîõ äðîá³â	
	public static RationalNumber add(RationalNumber first, RationalNumber second){
		RationalNumber result= new RationalNumber();
		//ÿêùî çíàìåííèêè ð³âí³
		if(first.denominator==second.denominator){
			result.denominator=first.denominator;
			result.numerator=first.numerator+second.numerator;
		}else {
			result.denominator=first.denominator*second.denominator;
			result.numerator=first.numerator*second.denominator+second.numerator*first.denominator;
		}
		//ñêîðî÷åííÿ äðîáó
		int gcd=gcd(result.numerator, result.denominator);
		result.numerator/=gcd;
		result.denominator/=gcd;
		return result;
	}
//â³äí³ìàííÿ äâîõ äðîá³â
	public static RationalNumber sub(RationalNumber first, RationalNumber second){
		RationalNumber result= new RationalNumber();
		//ÿêùî ïåðøèé äð³á á³ëüøèé
		if (compare(first, second)) {
			//ÿêùî çíàìåííèêè ð³âí³
			if(first.denominator==second.denominator){
				result.denominator=first.denominator;
				result.numerator=first.numerator-second.numerator;
			}else {
				result.denominator=first.denominator*second.denominator;
				result.numerator=first.numerator*second.denominator-second.numerator*first.denominator;
			}
		}else{
			//ÿêùî çíàìåííèêè ð³âí³
			if(first.denominator==second.denominator){
				result.denominator=first.denominator;
				result.numerator=second.numerator-first.numerator;
			}else {
				result.denominator=first.denominator*second.denominator;
				result.numerator=second.numerator*first.denominator-first.numerator*second.denominator;
			}
		}
		//ñêîðî÷åííÿ äðîáó
		int gcd=gcd(result.numerator, result.denominator);
		result.numerator/=gcd;
		result.denominator/=gcd;
		return result;
	}
//ìíîæåííÿ äâîõ äðîá³â
	public static RationalNumber mul(RationalNumber first, RationalNumber second){
		RationalNumber result= new RationalNumber();		
		result.numerator=first.numerator*second.numerator;
		result.denominator=first.denominator*second.denominator;
		//ñêîðî÷åííÿ äðîáó
		int gcd=gcd(result.numerator, result.denominator);
		result.numerator/=gcd;
		result.denominator/=gcd;
		return result;
	}
//ä³ëåííÿ äâîõ äðîá³â
	public static RationalNumber div(RationalNumber first, RationalNumber second){
		RationalNumber result= new RationalNumber();	
		result.numerator=first.numerator*second.denominator;
		result.denominator=first.denominator*second.numerator;
		//ñêîðî÷åííÿ äðîáó
		int gcd=gcd(result.numerator, result.denominator);
		result.numerator/=gcd;
		result.denominator/=gcd;
		return result;
}
//ïîð³âíÿííÿ äâîõ äðîá³â
	public static boolean compare(RationalNumber first, RationalNumber second){
		boolean result;
		if(first.numerator*second.denominator>=second.numerator*first.denominator) result=true;
		else result=false;
		return result;
	}
//âèâ³ä
	public static void out(RationalNumber drib){
		System.out.println(drib.numerator+"/"+drib.denominator);
	}
}