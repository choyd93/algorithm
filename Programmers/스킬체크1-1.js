function solution(arr, divisor) {
    let answer = [];
    
    arr.map((v)=> {
     return (v % divisor === 0 ? answer.push(v) : answer);
        
    })
    answer.length !== 0 ? answer.sort((a, b ) => a - b) : answer.push(-1);
    
    return answer;
}