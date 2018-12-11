alert(document.head.innerHTML);
var variant = 10;
var elem = document.getElementById('list-header');
elem.innerHTML = '<b>' + elem.textContent + ' ' + variant + '</b>';
var name = "Serhii";
document.getElementsByTagName("li")[1].innerHTML = name;
document.getElementsByTagName("ul")[0].style.color = '#555';