numbers = [4,2,1,5,0]
product = []

function calculateProducts(numbers){
for (let i = 0; i < numbers.length; i++) {
    let eachProduct = 1;
    for (let j = 0; j < numbers.length; j++) {
        if(j == i){
            console.log("my name" + j)
            continue}
        else{
            eachProduct = numbers[j] * eachProduct;
        }
        }
    product.push(eachProduct)
}}

console.log(product)