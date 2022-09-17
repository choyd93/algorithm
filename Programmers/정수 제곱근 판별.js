function solution(n) {
  const sqrtNumber = Math.sqrt(n);

  if (!Number.isInteger(sqrtNumber)) {
    return -1;
  }
  return Math.pow(sqrtNumber + 1, 2);
}
