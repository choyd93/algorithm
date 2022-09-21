function solution(n) {
  return Number(
    (n + "")
      .split("")
      .sort((a, b) => b - a)
      .reduce((a, b) => a + b)
  );
}
