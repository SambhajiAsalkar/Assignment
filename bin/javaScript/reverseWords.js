function reverseWordsOfSentence(input) {
    const words = input.split(' ');
    const reversedWords = [];

    for (const word of words) {
        let reversedWord = '';
        for (let i = word.length - 1; i >= 0; i--) {
            reversedWord =reversedWord + word[i];
        }
        reversedWords.push(reversedWord);
    }

    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}

const inputSentence = "This is a sunny day";
const reversedResult = reverseWordsOfSentence(inputSentence);
console.log(reversedResult); 