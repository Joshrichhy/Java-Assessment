const num = [3,2,3,4,6]

function rotateArray(num){
const temp = num.pop()
num.unshift(temp)
return num}


console.log(rotateArray(num))