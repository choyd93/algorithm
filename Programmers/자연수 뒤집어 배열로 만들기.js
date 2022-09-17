function solution(n) {
  let arr = [];
  const result = String(n)
    .split("")
    .reverse()
    .forEach((item) => arr.push(Number(item)));
  return arr;
}
