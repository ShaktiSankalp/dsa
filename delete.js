let arr = [1,2,3,4,5,6];
let ob = {
    a:1,
    b:2,
    c:3
}
let sum = 0;
// for(n of arr){
//     sum = sum + n;
// }

for(n in ob){
    sum = sum + ob[n];
}
console.log(sum);


