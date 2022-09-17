function solution(s) {
  let pWordArr = [];
  let yWordArr = [];

  s.toLowerCase()
    .split("")
    .forEach((word) => {
      if (word === "p") {
        pWordArr.push(word);
      }
      if (word === "y") {
        yWordArr.push(word);
      }
    });

  if (pWordArr.length === yWordArr.length) {
    return true;
  }

  return false;
}
