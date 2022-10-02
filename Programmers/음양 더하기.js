function solution(absolutes, signs) {
  const result = absolutes.reduce(
    (acc, curr, i) => acc + curr * (signs[i] ? 1 : -1),
    0
  );

  return result;
}
