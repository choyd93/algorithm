function solution(price, money, count) {
  let a = price;
  let result = 0;

  for (let i = 1; i <= count; i++) {
    a = price * i;
    result += a;
  }

  return money > result ? 0 : result - money;
}
