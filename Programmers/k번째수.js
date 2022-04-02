function solution(array, commands) {
    let newArray = [];
    let result = [];

 for(let i = 0; i < commands.length; i++){
    newArray = commands[i];
    let sliceArray = array.slice(newArray[0] - 1,newArray[1]);
    let sortArray = sliceArray.sort((a, b) =>{
        return a - b;
    });
    result.push(sortArray[newArray[2]-1]);
 }
  return result ;
}