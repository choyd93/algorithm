function solution(x) {
  const a = String(x).split("");
  const b = a.reduce((a, b) => Number(a) + Number(b));

  if (x % b === 0) {
    return true;
  }
  return false;
}
