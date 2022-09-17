function solution(n) {
  let arr = [];

  for (let i = 0; i <= n; i++) {
    if (n === 0) {
      return 0;
    }
    if (n % i === 0) {
      arr.push(i);
    }
  }
  return arr.reduce((a, b) => a + b);
}
