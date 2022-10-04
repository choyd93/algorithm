function solution(a, b) {
  let result = 0;
  const arr = a.map((item, i) => (result += item * b[i]));
  return result;
}
