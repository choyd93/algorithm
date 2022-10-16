function solution(left, right) {
  let result = 0;
  let number = left;

  while (number <= right) {
    let a = 0;

    for (let i = 1; i <= number; i++) {
      if (number % i === 0) {
        a += 1;
      }
    }

    a % 2 === 0 ? (result += number) : (result -= number);
    number += 1;
  }

  return result;
}
