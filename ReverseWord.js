/*2. JavaScript
A. Take a sentence as an input and reverse every word in that sentence. Example –
This is an sunny day > sihT sin a ynnus yad.*/
var str=prompt("Enter the String to reverse ech word of it")
var str2=str.split(" ")
console.log(str2)
for(var i=0;i<str2.length;i++)
{
var temp=str2[i].toString()
str2[i]=temp.split("").reverse().join("")
}
str=str2.join(" ")
console.log(str)