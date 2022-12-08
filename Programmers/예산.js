function solution(d, budget) {
    const a = d.sort((a, b) => a - b)
    let result = budget;

    for (let i = 0; i <= d.length; i++) {
        result = result - a[i];
        if (result < 0 || a[i] === undefined) {
            return i;
        }
    }
}