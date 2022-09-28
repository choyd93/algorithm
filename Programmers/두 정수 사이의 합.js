function solution(a, b) {
  let arr = [];

  if (a === b) {
    return a;
  }

  if (a < b) {
    for (let i = a; i <= b; i++) {
      arr.push(i);
    }
  }

  if (a > b) {
    for (let i = b; a >= i; i++) {
      arr.push(i);
    }
  }

  return arr.reduce((a, b) => a + b);
}
