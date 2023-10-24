// Original String
let str= "This is Javascript";

// Get words from string
const wordsArr = str.split(' ');

// Loop through each word
for(let i = 0; i < wordsArr.length; i++){
    
    // Current word
    let word = wordsArr[i];
    
    // Create an empty string to store reversed word
    let tempWord = "";
    
    // Loop through current word string
    for(let j = word.length - 1; j >= 0; j--){
        
        // Join each character of original word
        // in a reversed manner
        tempWord = tempWord + word[j];
        
    }
    
    // Replace original word with the reversed word
    wordsArr[i] = tempWord;
    
}

// Join back each reversed word with a space character(' ')
const reversedStr = wordsArr.join(' ');

// Print the result
console.log(reversedStr);