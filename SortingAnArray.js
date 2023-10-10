//B. Perform sorting of an array in descending order.
const n=Number(prompt("Enter the size of the array:"))
var array=new Array();
for(var i=0; i<n;i++)
{
array.push(Number(prompt("Enter the random number one by one for descending order ")))
}
for(var i=0 ; i<n;i++)
{
for(var j=0; j<n-1-i;j++)
{
if(array[j] <= array[j+1])
{
var temp = array[j]
array[j] = array[j+1]
array[j+1] = temp
}
}
}
console.log(array)