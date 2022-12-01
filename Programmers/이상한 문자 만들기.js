function solution(s) {
    let result = [];
    const changedWord = s.split(' ');

    changedWord.map(v => {
        let word = v.split('');
        for (let y = 0; y <= word.length; y++) {
            if ((y+1) % 2 === 1){
                word.splice(y,1,word[y]?.toUpperCase());
            }
        }
        result.push(word.join(''));
    })
    return result.join(' ');
}