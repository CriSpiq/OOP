alert("Zavdannya 1")
var name ="Gurey Rost";
alert(name);

alert("Zavdannya 2")
var a=10, b=12;
var c=a-b;
var d=7;
var result=c+d;
alert(result);

alert("Zavdannya 3")
var variant;
variant=prompt("Vvedit vash variant: ");
var a=variant;
if(a>=7) alert("True");
else alert("False");
if(a%2==0) a=+a+7;
else a-=3;
alert(a);

alert("Zavdannya 4")
end=+variant+10;
document.write("Kvadratu vid 1 do " + end + " :");
for(var i=1;i<=end;i++){
	document.write("<br />" + i + " = " + (i*i)); 
	}

alert("Zavdannya 5")
	document.write("<br />" + "<br />" + "Prosti chisla vid 2 do " + end + " :" + "<br />");
var k =0;
   for(var i=2;i<=end;i++){
		for(var j=1;j<=end;j++)
			if(i%j==0)k++;  
		if(k==2){
			document.write( +i +"<br />"); 
			k=0; 
		} else k=0;
	} 