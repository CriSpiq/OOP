function numb(data,month,variant){
	return((data+month)/variant)
}
alert("Zavdannya 2");
var data,month,variant;
data=prompt("vvedit den narodjennya: ");
month=prompt("vvedit misyac narodjennya: ");
variant=prompt("vvedit sviy variant: ");
alert(numb(+data,+month,+variant));