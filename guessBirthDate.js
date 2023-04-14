const prompt = require("prompt-sync")();

day = 17;

const date = prompt("Enter Age")

while (date!= day){
    console.log("Incorrect guess")
    let date = prompt("Enter Age")
    if (date == day){
        console.log("Correct guess")
        break
    }
}



