function solution(n) {
  let answer = 0;

  for (let i = 1; i >= 1; i++) {
    if (n % i === 1) {
      return (answer = i);
    }
  }
}
