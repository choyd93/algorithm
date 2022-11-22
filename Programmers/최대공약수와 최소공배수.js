function solution(n, m) {
    const maxNumber = Math.max(n, m);
    let arr1 = [];
    let arr2 = [];
    let index = 1;

    while (index <= maxNumber){
        n % index === 0 && arr1.push(index);
        m % index === 0 && arr2.push(index);
        index += 1;
    }

    const sameNumber = arr1.filter((v) => arr2.includes(v));
    const a = Math.max(...sameNumber);
    const b = n * m / a;
    const answer = [a, b];

    return answer;
}