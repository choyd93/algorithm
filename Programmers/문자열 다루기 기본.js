function solution(s) {
  if (!(s.length === 4 || s.length === 6)) {
    return false;
  }

  return !/[A-za-z]/g.test(s);
}
