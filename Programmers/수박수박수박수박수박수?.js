function solution(n) {
  const su = "수";
  const result = su
    .repeat(n)
    .split("")
    .map((item, i) => ((i + 1) % 2 === 0 ? item.replace("수", "박") : item))
    .join("");

  return result;
}
