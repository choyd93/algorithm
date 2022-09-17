function solution(n) {
  const result = [];
  const arr = String(n).split("");

  arr.forEach((item) => {
    result.push(parseInt(item));
  });

  return result.reduce((a, b) => a + b);
}
