function solution(phone_number) {
  const a = phone_number.length;
  const b = phone_number.slice(a - 4, a);

  if (a === 4) return b;

  let c = "*";
  for (let i = 1; i < a - 4; i++) {
    c = "*" + c;
  }
  return c + b;
}
