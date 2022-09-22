function solution(num) {
  let result = num;
  let idx = 0;

  if (num === 1) {
    return 0;
  }

  while (idx < 500) {
    if (result % 2 === 1) {
      result = result * 3 + 1;
      idx++;
    }
    if (result % 2 === 0) {
      result = result / 2;
      idx++;
    }
    if (result === 1) {
      return idx;
    }
    if (idx === 500) {
      return -1;
    }
  }
}
