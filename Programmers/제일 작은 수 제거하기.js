function solution(arr) {
  if (arr.length === 1) {
    return [-1];
  }
  const a = [...arr];
  const c = Number(
    arr
      .sort((a, b) => a - b)
      .slice(0, 1)
      .toString()
  );
  const d = a.filter((item) => item !== c);
  return d;
}
